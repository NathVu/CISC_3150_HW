import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(input.hasNext()) {
            String pal = input.next();
            boolean isPal = true;
            for(int i = 0; i < (pal.length()/2); i++){
                if(pal.charAt(i) != pal.charAt(pal.length() - i - 1)){
                    isPal = false;
                    break;
                }
            }
            if(isPal == true) {
                System.out.println(pal + " is a palindrome");
            }
            else {
                System.out.println(pal + " is not a palindrome");
            }
        }
    }
}
