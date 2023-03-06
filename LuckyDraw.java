import java.util.ArrayList;
import java.util.Scanner;

public class LuckyDraw {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		//System.out.println("Input: ");
		
		int count = input.nextInt();
		
		for(int i = 0; i < count; i++) {
			int number = input.nextInt();
			if(number >= 1 && number <= 100) {
				numbers.add(number);
			}
		}
	
		
		while(true) {
			int deletecount = 0;
			for(int i = 0; i < (count-1); i++) {
				if((numbers.get(i)+numbers.get(i+1))%2 == 0){
					numbers.remove(i+1);
					numbers.remove(i);
					deletecount ++;
					count = count - 2;	
				}
			}
			if(deletecount == 0) {
				System.out.print(count);
				break;
			}
		
			
		}
		
	}

}
