package td_1.conditions;

import java.util.Scanner;
public class ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,delta,x1,x2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a:");
		a=scan.nextDouble();
		System.out.println("Enter b:");
		b=scan.nextDouble();
		System.out.println("Enter c:");
		c=scan.nextDouble();
		
		delta=b*b - 4*a*c;
		if(delta<0) {
			System.out.println("L'equation n'a pas de solution dans R!");
		}
		else if(delta==0) {
			x1=-b/(2*a);
			System.out.println("L'equation a une seule solution dans R: x="+x1);
		}
		else {
			double sqrt_delta = Math.sqrt(delta);
			x1=(-b + sqrt_delta)/(2*a);
			x2=(-b - sqrt_delta)/(2*a);
			System.out.println("L'equation a 2 solution dans R: x1="+x1+" x2="+x2);
		}		
		scan.close();
	}

}
