package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                int number = Integer.parseInt(str);
                return number > 0;
            } catch (NumberFormatException var2) {
                return false;
            }
        } else {
            return false;
        }
    }
}
