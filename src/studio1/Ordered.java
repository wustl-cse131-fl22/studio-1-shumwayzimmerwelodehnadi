package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean funTime = x > y; 
		boolean funTime1 = y > z;
		boolean funTime2 = x < y;
		boolean funTime3 = y < z; 
		boolean isOrdered = (funTime && funTime1 || funTime2 && funTime3);
		System.out.println(isOrdered);
		

	}

}
