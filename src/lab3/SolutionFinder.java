package lab3;

import java.util.Scanner;

public class SolutionFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		//int a=4,b=8,c=3;
		double tmp = Math.pow(b,2)-(4*a*c);
		if (tmp < 0) {
			System.out.println("No Answer");
		}else{
			double x1 = (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
			double x2 = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
	}

}
