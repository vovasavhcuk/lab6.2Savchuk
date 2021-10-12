package com.company;

public class CheckForBraces implements checkString{
    @Override
    public boolean check(String str) {
        String checkStr = ")(())(";
        if(str.equals(checkStr)){
            return true;
        }else {
            return false;
        }
    }
}
