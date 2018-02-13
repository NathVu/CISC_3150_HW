import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter(",");
        while(input.hasNext()){
            String temp = input.next();
            System.out.println(temp);
        }
    }
}
