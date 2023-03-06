import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DailyPrize {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int tWinnings = 0;
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int days = input.nextInt();
		
		for (int i = 0; i<days; i++) {
			int formCount = input.nextInt();
			for (int j = 0; j<formCount; j++) {
				int billAmt = input.nextInt();
				numbers.add(billAmt);
			}
			
			int maxBill = Collections.max(numbers);
			int minBill = Collections.min(numbers);
			int winnings = maxBill - minBill;
			tWinnings = tWinnings + winnings;
			
			numbers.remove(numbers.indexOf(maxBill));
			numbers.remove(numbers.indexOf(minBill));
			
		}
		input.close();
		
		System.out.println(tWinnings);
	
	}
}
