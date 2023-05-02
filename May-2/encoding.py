import mysql.connector
import base64

# Prompt the user for their name and email
name = input("Enter your name: ")
email = input("Enter your email: ")

# Encode the name and email using Base64 encoding
encoded_name = base64.b64encode(name.encode('utf-8')).decode('utf-8')
encoded_email = base64.b64encode(email.encode('utf-8')).decode('utf-8')

# Connect to the database
connection = mysql.connector.connect(
    host="localhost",
    user="root",
    password="password",
    database="encodingDB"
)

# Insert the encoded name and email into the database
cursor = connection.cursor()
sql = "INSERT INTO users (name, email) VALUES (%s, %s)"
values = (encoded_name, encoded_email)
cursor.execute(sql, values)
connection.commit()

print("Data stored successfully!")

# Close the database connection
cursor.close()
connection.close()