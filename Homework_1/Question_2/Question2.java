import java.util.Scanner;

  public class Question2{
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      while(input.hasNext()){
        double radius = input.nextDouble();
        System.out.println(Math.PI * Math.pow(radius,2.0));
      }

    }
  }
