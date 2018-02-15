import java.util.*;

public class MyString{
    private char[] chars;

    public MyString(char[] charIn) {
        chars = charIn;
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString substring(int begin, int end) throws Exception{
        if((end >= chars.length)||(begin > end)) {
            throw new Exception("Invalid Parameters");
        }
        char[] temp = new char[end-begin];
        for(int i = begin; i < end; i++) {
            temp[i-begin] = chars[i];
        }
        return new MyString(temp);
    }

    public MyString toLowerCase() {
        char[] temp = new char[chars.length];
        for(int i = 0; i < chars.length; i++) {
            temp[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString(temp);
    }

    public MyString toUpperCase() {
        char[] temp = new char[chars.length];
        for(int i = 0; i < chars.length; i++) {
            temp[i] = Character.toUpperCase(chars[i]);
        }
        return new MyString(temp);
    }

    public boolean equals(MyString s) {
        if(s.length() != chars.length) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != chars[i]) {
                return false;
            }
        }

        return true;
    }

    public MyString getMyString() {
        return new MyString(chars);
    }

    public String toString() {
        return new String(chars);
    }

    public static MyString valueOf(int i){
        int a = 1;
        int b = i;
        while(b > 10) {
            b = b/10;
            a++;
        }
        char[] temp = new char[a];
        for(int j = 0; j < a; j++) {
            temp[j] = (char)((i%10)+48);
            i = i/10;
        }
        return new MyString(temp);
    }
};
