package td_1.conditions;

import java.util.Scanner;
public class ex_7 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entrer un nombre de 3 chiffres:");
		String n= scan.nextLine(); 
		int nb = Integer.parseInt(n);
		if(nb>=100 && nb<1000) {
		char[] nbre = n.toCharArray();
		System.out.print("Les nombres formés par les chiffres de N sont :");
		System.out.println(n+","+nbre[1]+nbre[0]+nbre[2]+","+nbre[0]+nbre[2]+nbre[1]+","+nbre[1]+nbre[2]+nbre[0]+","+nbre[2]+nbre[1]+nbre[0]+","+nbre[2]+nbre[0]+nbre[1]+".");
		}
		else System.out.println("Le nombre que vous avez insere n'est valide!");
	}

}

