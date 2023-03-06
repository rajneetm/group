import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class HowManyWords {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> uniqueWords = new ArrayList<String>();
		String[] words;
		
		while (scan.hasNextLine()) {
			String input = scan.nextLine();
			String newInput = input.replaceAll("[^a-zA-Z]", " ");
			words = newInput.split(" ");
			
			for (String s: words) {
				if (!s.isEmpty() && !uniqueWords.contains(s.toLowerCase())) {
						uniqueWords.add(s.toLowerCase());
				}
			}
		}
		
		Collections.sort(uniqueWords);
		
		for (String s: uniqueWords) {
			System.out.println(s);
		}
	}
	
}
