package studio1;
import java.util.Scanner;


	
		// TODO Auto-generated method stub
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What is the year?");
		int input = in.nextInt();
		
		boolean divByFour = input % 4 == 0;
		boolean divByHun = input % 100 == 0;
		boolean divByFH = input % 400 == 0;
		
		//System.out.println(divByFour);
		//System.out.println(divByHun);
		//System.out.println(divByFH);

		boolean caseA = divByHun && divByFH;
		boolean caseB = caseA && divByFour;
		boolean caseC ;
		System.out.println(input + " is a leap year: " + caseB);
		
	}

}
