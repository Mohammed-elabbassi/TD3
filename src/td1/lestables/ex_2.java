package td_1.tables;

import java.util.Scanner;

public class ex_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter N:");
		int n = sc.nextInt();
		
		int [] t = new int[100];
		int i = 0;
		
		do {
			t[i] = n%2;
			n = n/2;
			i++;
		}while(n!=0);

		System.out.print(n+" in binary is: ");
		for(i=i-1;i >= 0; i--) {
			System.out.print(t[i]);
		}
	}

}
