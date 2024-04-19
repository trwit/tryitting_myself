package memo;

import java.util.Scanner;

public class TrojanHorses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Do you want to play the game 'Path to Millionaire'?");
		System.out.println("Please type 'Y' or 'N'.");
		System.out.print(">>> ");
		
		Scanner scan = new Scanner(System.in);
		String select = scan.nextLine();
		
		if (select.equals("Y")) {
			while(true) {
				System.out.print("?");
			}
		}else {
			System.out.print("bye.");
		}
			
	}

}
