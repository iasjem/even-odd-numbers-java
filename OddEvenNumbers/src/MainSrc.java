/*
 * A simple program that identifies the number n if it's even or odd or neither
 */

import java.util.Scanner;

public class MainSrc {

	public static void main(String[] args) {
		Scanner getN = new Scanner(System.in);
		System.out.println("Even or Odd? program by IasJem \n");
		System.out.print("n is equals to ");
		int n = getN.nextInt();
		
		evenOrOdd(n); // is n even or odd?
		
		getN.close();
		
	}
	
	private static void evenOrOdd (int n) {
		System.out.print("\n");
		if (n == 0 ) { // 0 is neither odd or even
			System.out.println(n+ " is neither odd or even.");
		} else { 
			if (n%2 == 0) { // if remainder is 0, n is even
				System.out.println(n+ " is an even number.");
			} else {
				System.out.println(n + " is an odd number.");
			}
		}
	}

}
