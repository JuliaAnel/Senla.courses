package eu.senla.task4;

import java.util.Locale;

public class StringUtil {
    public static String getRandomString(int elementSize) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        symbols += symbols.toLowerCase(Locale.ROOT);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < elementSize; i++) {
            stringBuffer.append(symbols.charAt(getRandomInt(0, symbols.length())));}
        return stringBuffer.toString();
}
    private static int getRandomInt(int from, int to) {

        return (int)(Math.random() * (to - from)) + from;
    }

    public static boolean isNumber(String value) {
        String symbols = "1234567890.";
        for (char ch : value.replace(".", "").toCharArray() ){
         if(!Character.isDigit(ch)){
             return false;
         }
        }
        return true;
    }
}
