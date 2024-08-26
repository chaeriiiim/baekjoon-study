package Main;

import java.util.Scanner;

public class _2525 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int H , M , M2;
		
		H = input.nextInt();
		M = input.nextInt();
		M2 = input.nextInt();
		
		int min = 60 * H + M;
		min += M2;
		
		int hour = ( min / 60 ) % 24;
		int minute = min % 60;
		
		System.out.println( hour + " " + minute );
		
		
		
		
	}
}
