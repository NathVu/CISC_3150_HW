import java.util.*;

public class Q1Second {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        SplittableRandom rand = new SplittableRandom();
        double x = 1,y = 1;
        double circle = 0;
        long end = 4000000000L;
        for(long i = 0; i < end; i++) {
                x = rand.nextDouble();
                y = rand.nextDouble();
                if(Math.sqrt(x*x+y*y) <= 1)
                    circle+=1;
            }
        System.out.println(4 * (circle/4000000000.0));
        System.out.println(System.currentTimeMillis()-before);
    }
}
