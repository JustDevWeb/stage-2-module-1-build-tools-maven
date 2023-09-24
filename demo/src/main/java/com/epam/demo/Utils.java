package com.epam.demo;

import java.util.List;

import static com.epam.utils.StringUtils.isPositiveNumber;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if ( args.size() > 0 ){
            for (String arg : args) {
                if ( !isPositiveNumber(arg) ) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}