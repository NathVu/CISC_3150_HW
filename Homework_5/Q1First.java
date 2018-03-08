import java.util.*;

public class Q1First {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        Random rand = new Random();
        double x = 0,y = 0;
        double circle = 0,square = 0;
        long end = 4000000000L;
        for(long i = 0; i < end; i++) {
                x = rand.nextDouble();
                y = rand.nextDouble();
                if(Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0)) <= 1)
                    circle+=1;
                else
                    square+=1;
        }
        square += circle;
        System.out.println(4*(circle/square));
        System.out.println(System.currentTimeMillis()-before);
    }
}
