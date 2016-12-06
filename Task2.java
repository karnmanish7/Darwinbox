// Task 2

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    
    public static String stub (String inputText, String[] babyDic) {
        
        int length = maxLengthString(babyDic);
        int maxlen = length;
        String resultString = "";
        String currentString = "";
        
        for(int i=0; i<inputText.length(); ) {

            while(maxlen > 0) {

                currentString = inputText.substring(i, maxlen);
                if(Arrays.asList(babyDic).contains(currentString)) {
                    resultString += " " + currentString;
                    i = maxlen;
                    maxlen += i;
                    if(maxlen > inputText.length()) {
                        maxlen = inputText.length();
                    }
                    break;
                } else {
                    maxlen--;
                }
            }
        }
        
        return resultString;
    }
    
    public static int maxLengthString(String[] a) {
        int maxLength = 0;
        for(String s : a) {
            if ( s.length() > maxLength)
                maxLength = s.length();
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Input data from the machine
        String grabledText = "gagagoogoo";
        
        //Baby Dictionary
        String[] babyWords = {"gag", "goo", "gaga"};
        
        System.out.println( stub( grabledText, babyWords ) );
    }
}