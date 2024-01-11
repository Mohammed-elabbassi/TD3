package td_1.boucles;

import java.util.Scanner;

public class ex_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Donner N:");
		int n = sc.nextInt();
		
		int s=0;
		
		while(n!=0) {
			s = s + n%10;
			n /= 10;
		}
		System.out.println("La somme est: "+s);
	}

}







/*

		String n = "123";
		Integer a = Integer.valueOf(n.charAt(0));
		String t[]=n.split("");
		System.out.println(Integer.valueOf(n.charAt(0))+Integer.valueOf(n.charAt(1))+Integer.valueOf(n.charAt(2)));
		System.out.println(Integer.valueOf(t[0])+Integer.valueOf(t[1])+Integer.valueOf(t[2]));
*/