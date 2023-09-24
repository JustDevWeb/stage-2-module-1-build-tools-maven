package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        int number = Integer.parseInt(str);
        return number > 0;
    }
}
