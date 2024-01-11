package td_1.conditions;

import java.util.Scanner;
public class ex_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose a langage:\n 1- FR\n 2-EN");
		int lang = scan.nextInt();
		switch(lang) {
		case 1: System.out.println("Quelle heure est-t-il?");
				int h = scan.nextInt();
				if(h>=0 && h<18) System.out.println("Bonjour Abdessamad!");
				if(h>=18 && h<22) System.out.println("Bonsoir Abdessamad!");
				if(h>=22 && h<24) System.out.println("Bonne nuit Abdessamad!");
				if(h>=24) System.out.println("Cela n'est pas une heure, c'est votre IQ hahahahaha.");
		break;
		case 2: System.out.println("What time is it?");
				int ho = scan.nextInt();
				if(ho>=0 && ho<18) System.out.println("Good Morning Abdessamad!");
				if(ho>=18 && ho<22) System.out.println("Good Evening Abdessamad!");
				if(ho>=22 && ho<24) System.out.println("Good Night Abdessamad!");
				if(ho>=24) System.out.println("It's not an hour, it's your girl's body count :).");
		break;
		}		
		scan.close();
	}

}
