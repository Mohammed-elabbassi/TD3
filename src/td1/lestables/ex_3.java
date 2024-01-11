package td_1.tables;

import java.util.Scanner;

public class ex_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double [] m = new double[10];
		int c = 0;
		
		System.out.println("Donner un seuil:");
		double n = sc.nextDouble();
		System.out.println("Entrer les moyennes:");
		for(int i=0;i<10;i++) {
			System.out.print("Etudient"+(i+1)+":");
			m[i] = sc.nextDouble();
			if(m[i]>=n)
				c++;
		}
		System.out.println("Le nombre des etudient ayant une moy >="+n+" est: "+c);
		
	}

}
