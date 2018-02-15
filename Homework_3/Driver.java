import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        MyString test = new MyString(input.nextLine().toCharArray());
        System.out.println("Testing charAt and length");
        for(int i = 0; i < test.length(); i++){
            System.out.print(test.charAt(i));
        }

        System.out.println("\nTesting Substring");
        for(int i = 0; i < test.length()-2; i++){
            System.out.println(test.substring(i,i+2));
        }

        try{
            System.out.println(test.substring(test.length(),test.length()-2));
        }
        catch(Exception e){
            System.err.println("Expected Error: " + e);
        }

        System.out.println("\nTesting toLowerCase");
        System.out.println(test.toLowerCase());

        System.out.println("\nTesting toUpperCase");
        System.out.println(test.toUpperCase());

        System.out.println("\nTesting equality");
        System.out.println(test.equals(test.toUpperCase()));
        MyString test2 = test;
        System.out.println(test.equals(test2));

        System.out.println("\nTesting valueOf");
        System.out.println(MyString.valueOf(1234567));

    }
}
