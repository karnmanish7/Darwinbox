// Task 1
import java.util.Scanner;

public class Task1 {
    
    static String result(int count, char c) {
        String s = "";
        if (count >= 4) {
            s += count +"@"+c;
        } else {
            for (int j = 0; j < count; j++) {
                s += c;
            }
        }
        return s;
    }
    
    public static String stub(String s) {
        
        String finalString = "";
        int count = 0;
        char c = s.charAt(0);
        char nextChar;
        
        for ( int i=0; i<s.length(); i++) {
            
            nextChar = s.charAt(i);
            
            if(nextChar == c) {
                count++;
            } else {
                finalString += result(count, c);
                c = nextChar;
                count = 1;
            }
        }
        
        finalString += result(count, c);
        return finalString;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( stub(sc.nextLine() ));        
    }
}
