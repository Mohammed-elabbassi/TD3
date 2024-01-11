package td_1.boucles;

public class ex_10 {

	public static void main(String[] args) {
		int i = 100;
		int n=0,u=0,d=0,m=0;
		System.out.println("Les nombres cubiques a trois chiffres sont:");
		do {
			n = i;
			u = n % 10;
			n /= 10;
			d = n % 10;
			i /= 10;
			m = n % 10;
			if( ((u*u*u) + (d*d*d) + (m*m*m)) == i )
				System.out.print(i+" , ");
			i++;
		}while(i<1000);
System.out.println("*******************************************");
	}

}




/*
for(int i = 101;i<1000;i++) {
	n = i;
	u = n % 10;
	n /= 10;
	d = n % 10;
	i /= 10;
	m = n % 10;
	if( ((u*u*u) + (d*d*d) + (m*m*m)) == i )
		System.out.print(i+" , ");
}
*/