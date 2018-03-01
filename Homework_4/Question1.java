import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = Integer.parseInt(input.nextLine());

		ArrayList<ArrayList<Character>> chars = new ArrayList<ArrayList<Character>>();

		ArrayList<Integer> pos = new ArrayList<Integer>();

		for(int j = 0; j < i; j++) {
            input.nextLine();
            pos.add(0);
			chars.add(new ArrayList<Character>());
            String[] line = input.nextLine().split(" ");
            for(int k = 0; k < line.length; k++) {
                    chars.get(j).add(line[k].charAt(0));
            }
        }
        String output = "";
        Boolean done = false;
		while(!done){
			output = "";
			for(int j = 0; j < pos.size(); j++){
				output += chars.get(j).get(pos.get(j));
			}
			System.out.println(output);

			int j = pos.size()-1;
			pos.set(pos.size()-1, pos.get(pos.size()-1)+1);
			for( ; j >= 0; j--){
				if(pos.get(j) == chars.get(j).size()){
					pos.set(j,0);
					if(j-1 >= 0)
						pos.set(j-1, pos.get(j-1)+1);
					else
						done = true;
				}
			}
		}
    }
}
