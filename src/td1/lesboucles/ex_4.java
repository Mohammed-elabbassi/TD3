package td_1.boucles;

import java.util.Scanner;
public class ex_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		int r;
		do {
			r = a % b;
			a = b;
			b = r;
		} while(r != 0);
		
		System.out.println("PGCD = "+a);
		
	}

}
