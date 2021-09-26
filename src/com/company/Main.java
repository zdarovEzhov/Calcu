package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print(">>: ");
        String first = read.next(); //первое число
        String operator = read.next(); //оператор
        String second = read.next(); //второе число
        int number1, number2, result;
        char operation = operator.charAt(0);


        number1 = RomanToNumber.romanToNumber(first);
        number2 = RomanToNumber.romanToNumber(second);
        if (number1 < 0 && number2 < 0) {
            System.out.println(""); //Без этого почему-то не работает
        } else {
            result = Calculated.calculated(number1, number2, operation);
            if (result < 0) {
                System.out.println("throws Exception");
            } else {
                System.out.println("Результат для римских1 цифр");
                String resultRoman = ConvertNumToRoman.convertNumToRoman(result);
                ;
                System.out.println(first + " " + operation + " " + second + " = " + resultRoman);
            }
        }


        number1 = Integer.parseInt(first);
        number2 = Integer.parseInt(second);
        result = Calculated.calculated(number1, number2, operation);
        if (result < 0) {
            System.out.println("throws Exception");
        } else {
            System.out.println("Результат для арабских цифр");
            System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        }
    }
}