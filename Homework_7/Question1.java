import java.util.*;

public class Question1{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            list.add(args[i]);
        }
        double answer;
        try{
            answer = resolve(list);
            System.out.println(answer);
        }
        catch(ArithmeticException E){
            System.out.println("Please do not divide by Zero");
        }
        catch(IllegalArgumentException E){
            System.out.println(E.getMessage());
        }
    }

    public static Double resolve(ArrayList<String> args) throws IllegalArgumentException{
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<String> temp2 = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < args.size(); i++){
            if(count != 0) {
                temp.add(args.get(i));
            }

            if(args.get(i).equals("(")) {
                count++;
            }

            else if(args.get(i).equals(")")){
                if(count == 0) {
                    //case not specified - missing an opening parenthesis
                    throw new AlgebraFailException();
                }
                count--;
                if(count == 0) {
                    temp.remove(temp.size()-1);
                    temp2.add(Double.toString(resolve(temp)));
                }
            }
            else if (count == 0){
                temp2.add(args.get(i));
            }

        }
        if(count != 0){
            //case not specified - closing parenthesis is missing
            throw new AlgebraFailException();
        }

        temp = new ArrayList<>();
        for(int i = 0; i < temp2.size(); i++){
            if(temp2.get(i).equals("x")) {
                temp.set(i-1,Double.toString(Double.parseDouble(temp2.get(i-1)) * Double.parseDouble(temp2.get(i+1))));
                i++;
            }
            else if (temp2.get(i).equals("/")) {
                if(Double.parseDouble(temp2.get(i+1)) == 0) {
                    throw new ArithmeticException();
                }
                temp.set(i-1,Double.toString(Double.parseDouble(temp2.get(i-1)) / Double.parseDouble(temp2.get(i+1))));
                i++;
            }
            else {
                temp.add(temp2.get(i));
            }
        }

        double answer = Double.parseDouble(temp.get(0));
        for(int i = 1; i < temp.size(); i++){
            if(temp.size() <= i+1)
                throw new UserIsADumbassException();
            if(temp.get(i).equals("+")){
                answer += Double.parseDouble(temp.get(i+1));
                i++;
            }
            else if(temp.get(i).equals("-")){
                answer -= Double.parseDouble(temp.get(i+1));
                i++;
            }
            else try{
                Double.parseDouble(temp.get(i));
            }
            catch(Exception E) {
                throw new QuitMashingOnYourKeyboardException();
            }
            else {
                //case not specified - 2 consecutive numbers
                throw new UserIsADumbassException();
            }
        }
        return answer;


    }
}
