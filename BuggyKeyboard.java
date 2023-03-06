import java.util.Scanner;
import java.util.Stack;

public class BuggyKeyboard {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		Stack<Character> in = new Stack<Character>();
		
		String test = info.nextLine();
		
		String s = "";
		
		if(test.length() < 1000000) {
			s = test;
		}
		
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == "<".charAt(0)) {
				in.pop();
				continue;
			}
			in.push(s.charAt(i));
		}
		
		info.close();
		
		
		StringBuilder str = new StringBuilder();
		for(char m: in) {
			str.append(m);
		}
		System.out.print(str.toString());
	}
	

}

