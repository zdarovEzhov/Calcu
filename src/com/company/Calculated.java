package com.company;

public class Calculated {
    public static int calculated(int num1, int num2, char op) {
        int result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                result = num1 / num2;

                break;


            default:
                throw new IllegalArgumentException("throws Exception");
        }
        return result;
    }
}
