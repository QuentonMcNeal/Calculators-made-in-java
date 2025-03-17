import java.util.Scanner;
public class Calcuate_Exponets {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(Math.pow( 5, 2));
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the base number?");
		int d = scan.nextInt();
		System.out.println("What is the exponet?");
		int f = scan.nextInt();
	int result = toPower(d ,f);
	System.out.println(d + " to the power of " + f + " is "+ result);}
		public static int toPower(int b, int c) {
			int result = 1;
			int e = 0;
			e = b;
			for(int i = 1; c > i; i++) {
			b = e * b;
			}
			result = b;
			return result;	
		}
	}
