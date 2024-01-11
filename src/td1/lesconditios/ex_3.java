package td_1.conditions;

import java.util.Scanner;
public class ex_3 {

	public static void main(String[] args) {

		int a=0,b=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrer a:");
		a=scan.nextByte();
		System.out.println("Entrer b:");
		b=scan.nextByte();
		
		System.out.println("choisissez l' un des choix suivants:");
		System.out.println("1. Savoir si la somme a + b est paire ;\r\n"
				+ "2. Savoir si le produit ab est pair ;\r\n"
				+ "3. Connaître le signe de la somme a + b ;\r\n"
				+ "4. Connaître le signe du produit ab.\r\n");
		int choix= scan.nextInt();
		
		switch (choix) {
		
		case 1: if((a+b)%2==0) System.out.println("La somme de a et b est paire.");
				else System.out.println("La somme de a et b est impaire.");
		break;
		
		case 2: if((a*b)%2==0) System.out.println("Le produit de a et b est paire.");
				else System.out.println("Le produit de a et b est impaire.");
	 	break;
		case 3: if((a+b)>=0) System.out.println("La somme est positive.");
				else System.out.println("La somme est negative.");
		break;
		case 4: if((a*b)<=0) System.out.println("Le produit est negative.");
				else System.out.println("Le produit est positive.");
		break;
		default: System.out.println("n/a");
		
		scan.close();
		}
	}
		

}
