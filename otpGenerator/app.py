from flask import Flask, redirect, session, url_for, render_template, request
import random
import smtplib


def generate(email):
    otp = ''.join([str(random.randint(0,9)) for i in range(6)])
    password = 'hfqkzjryvrxigwzt'
    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.starttls()
    server.login('hari02maha@gmail.com', password)
    msg = 'Hello, your otp is ' + str(otp)
    print(otp)
    server.sendmail('hari02maha@gmail.com', email, msg)
    print("sent!")
    server.quit()
    return otp

otObtained = 0;

app = Flask(__name__)

@app.route('/', methods=["POST", "GET"])

def index(): 
    
    return render_template('index.html')

@app.route('/otp_ui', methods=["POST", "GET"])

def otp():
    global otObtained
    name = request.form['name']
    email = request.form['email']
    otObtained = generate(email)
    return render_template('otp_ui.html')

@app.route('/nextPage', methods=["POST", "GET"])
def nextPage():
    msg = ""
    ot0 = request.form["otp0"] * 100000
    ot1 = request.form["otp1"] * 10000
    ot2 = request.form["otp2"] * 1000
    ot3 = request.form["otp3"] * 100
    ot4 = request.form["otp4"] * 10
    ot5 = request.form["otp5"] * 1
    
    ot = ot0 + ot1 + ot2 + ot3 + ot4 + ot5

    if(ot==otObtained):
        msg = "Verification Successful!"
    else:
        msg = "Not the right OTP!"
    
    return render_template('nextPage.html', msg = msg)


if __name__ == "__main__":
    app.run(debug=True)