package com.company;

public class RomanOrArab {
    public static boolean romanOrArab(String roman) {
        try {
            if (roman.equals("I")) {
                return true;
            } else if (roman.equals("II")) {
                return true;
            } else if (roman.equals("III")) {
                return true;
            } else if (roman.equals("IV")) {
                return true;
            } else if (roman.equals("V")) {
                return true;
            } else if (roman.equals("VI")) {
                return true;
            } else if (roman.equals("VII")) {
                return true;
            } else if (roman.equals("VIII")) {
                return true;
            } else if (roman.equals("IX")) {
                return true;
            } else if (roman.equals("X")) {
                return true;
            }
        } catch (NullPointerException e) {
            System.out.println("throws Exception");
        }
        return false;
    }
}