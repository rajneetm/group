import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EfficientAdding {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		long count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			int number = input.nextInt();
			if(number >= 1 && number <= 100000) {
				numbers.add(number);
			}else {
				throw new IllegalArgumentException();
			}
		}
		
		long cost = 0;
		
		while(numbers.size() >= 2) {
			Collections.sort(numbers);
			
			int n1 = numbers.get(0);
			int n2 = numbers.get(1);
			
			int newsum = n1 +n2;
			
			numbers.remove(0);
			numbers.remove(0);
			
			numbers.add(newsum);
			
			Collections.sort(numbers);
			
			results.add(newsum);
		}
		
		for(int i = 0; i < results.size(); i++) {
			int value = results.get(i);
			cost += value;
		}
		
		System.out.println(cost);
	
	}
}
