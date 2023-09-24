package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
       for (String arg : args) {
           if ( !isPositiveNumber(arg) ) {
               break;
           }
       }

       return true;
    }
}