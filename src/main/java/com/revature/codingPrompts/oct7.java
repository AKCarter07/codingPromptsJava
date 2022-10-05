package com.revature.codingPrompts;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class oct7 {
    public static void main(String[] args) {
        System.out.println("121317 :: " + validPin("121317"));
        System.out.println("1234 :: " + validPin("1234"));
        System.out.println("45135 :: " + validPin("45135"));
        System.out.println("89abc1 :: " + validPin("89abc1"));
        System.out.println("900876 :: " + validPin("900876"));
        System.out.println(" 4983 :: " + validPin(" 4983"));
        System.out.println("    :: " + validPin("    "));

    }

    public static boolean validPin(String pin){
        Pattern fourDigits = Pattern.compile("\\d{4}");
        Pattern sixDigits = Pattern.compile("\\d{6}");
        Matcher four = fourDigits.matcher(pin);
        Matcher six = sixDigits.matcher(pin);
        boolean result = false;
        if (four.matches() || six.matches()){
            result = true;
        }
        return result;
    }
}
