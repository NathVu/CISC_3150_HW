import java.util.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

public class Q1{
    public static void main(String[] args) {
        int pos = 97;
        Thread t1 = new Thread(new alpha(pos++));
        Thread t2 = new Thread(new alpha(pos++));
        Thread t3 = new Thread(new alpha(pos++));
        Thread t4 = new Thread(new alpha(pos));
        try{
            t1.start();
            TimeUnit.MILLISECONDS.sleep(25);
            t2.start();
            TimeUnit.MILLISECONDS.sleep(25);
            t3.start();
            TimeUnit.MILLISECONDS.sleep(25);
            t4.start();
        } catch(Throwable e){}
    }

}

class alpha implements Runnable{
    int letter;

    alpha(int l){
        letter = l;
    }

    @Override
    public void run(){
        try{
            while(letter < 123){
                System.out.println((char)letter);
                letter += 4;
                Thread.sleep(100);
            }
        }catch(Throwable e){}
    }
}
