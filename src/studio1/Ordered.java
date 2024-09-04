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
	boolean stepOne = x < y;
	boolean stepTwo = y < z;
	boolean decreasing = stepOne && stepTwo;
	//System.out.println(decreasing);
	
	boolean stepThree = x > y;
	boolean stepFour = y > z;
	boolean increasing = stepThree && stepFour;
	//System.out.println(increasing);
	
	boolean isOrdered = decreasing || increasing;
	System.out.println(isOrdered);
	/*
	 * System.out.println( x < y < z);
	 */	}

}
