package td_1.conditions;

import java.util.Scanner;
public class ex_9 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter le premier nombre:");
		int a=scan.nextInt();
		System.out.println("Enter le deuxieme nombre:");
		int b=scan.nextInt();
		
		if(a>=b) { 
			int temp = a;
			a=b;
			b=temp;
		}
		System.out.println("Les nombres en orde croissant: "+a+","+b);
	}

}
