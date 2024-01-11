package td_1.conditions;

import java.util.Scanner;
public class ex_6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter un entier A:");
		int a = scan.nextInt();
		System.out.println("Enter un entier B:");
		int b = scan.nextInt();
		
		if(a>0 && b>0 || a<0 &&  b<0) System.out.println("Le produit de A et B est positif.");
		else System.out.println("Le produit de A et B est negatif.");
	}

}
