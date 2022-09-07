package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ENTER YEAR"); 
		int number = in.nextInt();
		boolean ifDiv4 = (number % 4 == 0);
		boolean ifNotDiv100 = (number % 100 > 0); 
		boolean ifDiv400 = (number % 400 == 0);
		boolean ifLeapYear = (ifDiv4 && ifNotDiv100 || ifDiv400); 
		System.out.println(number + " is a leap year: " + ifLeapYear); 
		
		// Creative exercise: int, boolean, int, double, String, String, double

	}

}
