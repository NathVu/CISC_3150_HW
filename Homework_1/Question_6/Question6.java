import java.util.Scanner;
import javafx.util.Pair;

public class Question6{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Press Enter to Begin");
    while(input.hasNext()) {
      System.out.println("Enter the coordinates of the center of the first circle and then the radius");
      int point1X = input.nextInt();
      int point1Y = input.nextInt();
      Pair<Integer,Integer> center1 = new Pair<>(point1X,point1Y);
      double radius1 = input.nextDouble();
      System.out.println("Enter the coordinates of the center of the second circle and then the radius");
      int point2X = input.nextInt();
      int point2Y = input.nextInt();
      Pair<Integer,Integer> center2 = new Pair<>(point2X,point2Y);
      double radius2 = input.nextDouble();

      //testing if circle2 is inside circle1
      if((Math.sqrt(Math.pow(center1.getKey()-center2.getKey(),2.0) +
      Math.pow(center1.getValue()-center2.getValue(),2.0)) + radius2) <= radius1) {
        System.out.println("The circle with the central coordinates: " + center2.getKey() + "," + center2.getValue() +
        " and radius: " + radius2 + " is inside the circle with central coordinates: " + center1.getKey() + "," + center1.getValue()
        + " and radius: " + radius1);
      }

      //testing if circle1 is inside circle2
      else if((Math.sqrt(Math.pow(center1.getKey()-center2.getKey(),2.0) +
      Math.pow(center1.getValue()-center2.getValue(),2.0)) + radius1) <= radius2) {
        System.out.println("The circle with the central coordinates: " + center1.getKey() + "," + center1.getValue() +
        " and radius: " + radius1 + " is inside the circle with central coordinates: " + center2.getKey() + "," + center2.getValue() + " and radius: "
        + radius2);
      }

      //testing if circle1 and circle2 overlap
      else if(Math.sqrt(Math.pow(center1.getKey()-center2.getKey(),2.0) +
      Math.pow(center1.getValue()-center2.getValue(),2.0)) < (radius1 + radius2)) {
        System.out.println("The circle with central coordinates: " + center1.getKey() + "," + center1.getValue() + " and radius: " + radius1 +
        " and the circle with central coordinates: " + center2.getKey() + "," + center2.getValue() + " and radius: " + radius2 + " are overlapping ");
      }

      //testing if circle 1 and circle2 touch
      else if(Math.sqrt(Math.pow(center1.getKey()-center2.getKey(),2.0) +
      Math.pow(center1.getValue()-center2.getValue(),2.0)) == (radius1 + radius2)) {
        System.out.println("The circle with central coordinates: " + center1.getKey() + "," + center1.getValue() + " and radius: " + radius1 +
        " and the circle with central coordinates: " + center2.getKey() + "," + center2.getValue() + " and radius: " + radius2 + " are touching each other");
      }

      //if does not fit the first categories then must be seperate
      else {
        System.out.println("The circle with central coordinates: " + center1.getKey() + "," + center1.getValue() + " and radius: " + radius1 +
        " and the circle with central coordinates: " + center2.getKey() + "," + center2.getValue() + " and radius: " + radius2 + " are separate from each other");
      }
    }
  }
}
