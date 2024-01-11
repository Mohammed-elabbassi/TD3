package td_1.conditions;

import java.util.Scanner;
public class ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z,max;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter un entier x:");
		x=scan.nextByte();
		System.out.println("Enter un entier y:");
		y=scan.nextByte();
		System.out.println("Enter un entier z:");
		z=scan.nextByte();
		max=x;
		if(y>max) {
			max=y;
		}
		if(z>max) {
			max=z;
		}
		System.out.println("Le maximum est: "+max);		
		scan.close();
	}

}
