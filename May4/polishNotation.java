package May4;

import java.util.Stack;

public class polishNotation {

    public static int evalRPN(String[] tokens) {
        if (tokens == null)
            return 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        int len = tokens.length;
        for (int i = 0; i < len; i++) {
            String str = tokens[i];
            if (isOperator(str)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch(str.charAt(0)) {
                    case '+':
                        stack.push(num1 + num2);
                        break;
                    case '-':
                        stack.push(num1 - num2);
                        break;
                    case '*':
                        stack.push(num1 * num2);
                        break;
                    case '/':
                        stack.push(num1 / num2);
                        break;
                }
            }
            else
                stack.push(Integer.parseInt(str));
        }
        return stack.pop();
    }
    
    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    public static void main(String[] args) {
        evalRPN({'a','b','+'});
    }
}