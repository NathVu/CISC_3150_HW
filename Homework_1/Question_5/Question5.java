import java.util.Scanner;
import javafx.util.Pair;

public class Question5{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while(input.hasNext()) {
      int tempAX = input.nextInt();
      int tempAY = input.nextInt();
      Pair<Integer,Integer> A = new Pair<>(tempAX,tempAY);
      int tempBX = input.nextInt();
      int tempBY = input.nextInt();
      Pair<Integer,Integer> B = new Pair<>(tempBX,tempBY);
      int tempCX = input.nextInt();
      int tempCY = input.nextInt();
      Pair<Integer,Integer> C = new Pair<>(tempCX,tempCY);
      double sideAB, sideBC, sideAC;
      sideAB = Math.sqrt(Math.pow(A.getKey()-B.getKey(),2.0) + Math.pow(A.getValue()-B.getValue(),2.0));
      sideBC = Math.sqrt(Math.pow(B.getKey()-C.getKey(),2.0) + Math.pow(B.getValue()-C.getValue(),2.0));
      sideAC = Math.sqrt(Math.pow(A.getKey()-C.getKey(),2.0) + Math.pow(A.getValue()-C.getValue(),2.0));
      if(((sideAB+sideBC)<=sideAC)||((sideAB+sideAC)<=sideBC)||((sideBC+sideAC)<=sideAB)) {
        System.out.println("The triangle with points A:" + A.getKey() + "," + A.getValue()
        + " B:" + B.getKey() + "," + B.getValue() + " C:" + C.getKey() + "," + C.getValue()
        + " is not a real triangle");
      }
      else {
        System.out.println("The triangle with points A:" + A.getKey() + "," + A.getValue()
        + " B:" + B.getKey() + "," + B.getValue() + " C:" + C.getKey() + "," + C.getValue()
        + " is a real triangle");
      }
    }
  }
}
