import java.util.*;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = input.nextInt();
        String[] weekDay = {"Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"};
        int currentDay = -1;
        while(currentDay == -1) {
            System.out.println("Enter the day of the week the first of January fell out on.\nex: Fr is Friday");
            String date = input.next();
            for(int i = 0; i < 7; i++) {
                if(date.equals(weekDay[i])) {
                    currentDay = i;
                    break;
                }
            }
            if(currentDay == -1) {
                System.out.println("Error: Invalid Input");
            }
        }
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
            days[1] = 29;
        }
        String[] months = {"January","February","March","April","May","June",
        "July","August","September","October","November","December"};

        for(int i = 0; i < 12; i++){
            System.out.printf("\n\n%11s%s%-8d\n", months[i], " ", year);
            System.out.println("Su Mo Tu We Th Fr Sa");
            for(int j = 1; j <= days[i]; j++) {
                if(currentDay > 6) {
                    currentDay = 0;
                    if(j!=1)
                        System.out.println();
                }
                if(j == 1) {
                    System.out.printf("%" + (2 + 3 * currentDay) + "d", j);
                }
                else if(currentDay == 0) {
                    System.out.printf("%2d" , j);
                }
                else {
                    System.out.printf("%3d" , j);
                }
                currentDay++;
            }
        }
        System.out.println();

    }
}
