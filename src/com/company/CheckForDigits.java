package com.company;

public class CheckForDigits implements checkString{
    @Override
    public boolean check(String str) {
        String digits = "0123456789";
        int count = 0;
        char[] tmp = str.toCharArray();
        if (tmp[0] == digits.charAt(0)) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < digits.length(); j++) {
                    if (tmp[i] == digits.charAt(j)) {
                        count++;
                    }
                }
            }
            if (count == str.length()) {
                return true;
            } else {
                return false;
            }
        }
    }
}
