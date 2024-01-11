package td_1.conditions;

import java.util.Scanner;
public class ex_4 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entrer votre note:");
		float n=scan.nextFloat();
		
		if(n>=16) System.out.println("T.bien!");
		if(n>=14 && n<16 ) System.out.println("Bien!");
		if(n>=12 && n<14) System.out.println("A.bien!");
		if(n>=10 && n<12) System.out.println("Passable.");
		if(n<10) System.out.println("Da3ti abro !");
		
		scan.close();
	}

}
