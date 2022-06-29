package com.bridgelabz;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        System.out.println("Welcome to Balance parentheses program");
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String exp1 = scanner.next();
        System.out.println("Expression " + exp1 + " isBalance : " + isBalancedParentheses(exp1));
    }

    //Method to check the expression's all brackets are balanced or not
    public static boolean isBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        if (expression == null || expression.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < expression.length(); i++) {

                if (expression.charAt(i) == '(' || expression.charAt(i) == '{' || expression.charAt(i) == '[') {
                    stack.push(expression.charAt(i));
                } else if (expression.charAt(i) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (expression.charAt(i) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (expression.charAt(i) == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            // if stack is empty finally , it means symbol is balance in expression
            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
