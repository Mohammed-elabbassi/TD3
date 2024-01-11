package td_1.conditions;
import java.util.Scanner;
public class ex_8 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter le numero du mois:");
		int m=scan.nextInt();
		
		switch(m) {
		
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			 System.out.println("31 jours.");
			 break;
			case 2: System.out.println("De quelle annee(entre 1900 et 2100)?");
		 		int a= scan.nextInt();
		 		if(a>=1900 && a<=2100) {
		 		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) System.out.println("29 jours.");
		 		else System.out.println("28 jours.");
		 		}
		 		else System.out.println("Ce n'est une annee  entre 1900 et 2100!");
		 	break;
			case 4: case 6: case 9: case 11:
				System.out.println("30 jours.");
			 break;
			default: System.out.println("Ce nombre n'est pas valide");
		}
	}

}
