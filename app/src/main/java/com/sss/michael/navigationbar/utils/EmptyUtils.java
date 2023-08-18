package com.sss.michael.navigationbar.utils;

public final class EmptyUtils {
    public EmptyUtils() {
    }

    public static boolean isEmpty(CharSequence s) {
        if (s == null) {
            return true;
        } else if (s.length() == 0) {
            return true;
        } else {
            return "".equals(s) || "null".equals(s) || "NULL".equals(s);
        }
    }

    public static boolean isStrNull(String str) {
        return !"-".equals(str) && !isEmpty(str);
    }
}
