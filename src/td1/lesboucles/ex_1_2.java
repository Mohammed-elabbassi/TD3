package td_1.boucles;

import java.util.Scanner;
public class ex_1_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un entier N: ");
		int n=sc.nextInt();
		int s=0 , f=1;
		for(int i=1; i<=n; i++) {
			f=f*i;
			if(n%2!=0) s+=i;
		}
		System.out.println("Le factoriel de N est:"+f);
		System.out.println("La somme des entier impairs et inferieur a N:"+s);
	}

}
