package td_1.boucles;

import java.util.Scanner;
public class ex_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter some integers:");
		System.out.println("NB: Your last number must be always 0!");
		int a , i=1, max=0 , c=1;
		do {
			System.out.println("number "+(i)+":");
			a=sc.nextInt();
			if(i==1) max=a;
			else if(a>max) {
					max=a;
					c=i;
				}
			i++;
		}while(a != 0);
		System.out.println("The maximum is: "+max);
		System.out.println("It's position: "+c);
	}

}
