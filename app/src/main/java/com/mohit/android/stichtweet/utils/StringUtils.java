package com.mohit.android.stichtweet.utils;

/**
 * All rights reserved
 * Created by mohit.agrawal on 2/5/18.
 */

public class StringUtils {

    public static boolean isNotNullOrEmpty(String string) {
        return !isNullOrEmpty(string);
    }

    public static boolean isNullOrEmpty(String string) {
        if (string == null) {
            return true;
        }
        return string.isEmpty();
    }
}
