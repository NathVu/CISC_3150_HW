import java.util.*;
import java.io.*;
public class Tree{
  public static void main(String[] args) throws IOException {
    //make sure pathname is valid use File.exists
    System.out.println("Enter the path to the root");
    Scanner input = new Scanner(System.in);
    PrintWriter output = new PrintWriter("dir_tree.txt");
    String path = input.next();
    File root = new File(path);
    ArrayList<Boolean> temp = new ArrayList<Boolean>();
    temp.add(true);
    DFS(root, temp, output);
  }

  public static void DFS(File root, ArrayList<Boolean> depth, PrintWriter output) {
    DepthIndents(depth, output);
    output.println(root.getName());
    if(root.isDirectory()){
      File[] children = root.listFiles();
      Boolean notLast = true;
      for(int i = 0; i < children.length; i++) {
        if(i == children.length-1){
            notLast = false;
        }
        ArrayList<Boolean> temp = new ArrayList<Boolean>(depth);
        temp.add(notLast);
        DFS(children[i],temp,output);
      }
    }
  }

  public static void DepthIndents(ArrayList<Boolean> depth, PrintWriter output){
    String outputString = "";
    if(depth.size() > 1){
      outputString = "+----";
    }
    for(int i = depth.size()-2; i >0; i--){
        if(depth.get(i)) {
            outputString = "|    " + outputString;
        }
        else {
            outputString = "     " + outputString;
        }
    }
    output.flush();
    output.print(outputString);
  }
}
