import java.util.*;

public class Question1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How tall should the pyramid be?");
        Integer pVal = input.nextInt();
        String left = "";
        String right = "";
        String width = "";
        for(int i = 1; i <= pVal; i++) {
            width += String.format("%"+(pVal.toString().length()+1)+"s", i);
        }
        for(int i = 1; i <= pVal; i++) {
            for(int j = 1; j <= i; j++){
                left += String.format("%"+(pVal.toString().length()+1)+"s", j);
            }
            for(int j = (i-1); j >= 1; j--) {
                right += String.format("%"+(pVal.toString().length()+1)+"s", j);
            }
            System.out.printf("%" + width.length() + "s%-" + (width.length()-2) + "s\n", left, right);
            right = "";
            left = "";
        }
    }
}
