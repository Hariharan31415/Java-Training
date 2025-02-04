package day13;
import java.util.*;
import java.util.Scanner;

class CustomStack {
    char arr[];
    int top = -1, MAX;

    public CustomStack(int size) {
        this.MAX = size;
        this.arr = new char[MAX];
    }

    void push(char c) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = c;
    }

    char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';  
        }
        return arr[top--];
    }

    char peek() {
        if (top == -1) {
            return '\0';
        }
        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class task4 {
    public static boolean RedundantParentheses(String expr) {
        CustomStack stack = new CustomStack(expr.length());

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                stack.push(ch);
            } else if (ch == ')') {
                boolean flag = false;

                while (!stack.isEmpty() && stack.peek() != '(') {
                    char top = stack.pop();
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        flag = true;
                    }
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

                if (!flag) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an expression: ");
        String expression = s.nextLine();
    

        if (RedundantParentheses(expression)) {
            System.out.println("redundant parentheses.");
        } else {
            System.out.println(" not  redundant parentheses.");
        }
    }
}
