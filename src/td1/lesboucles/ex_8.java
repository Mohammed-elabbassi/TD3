package td_1.boucles;

public class ex_8 {

	public static void main(String[] args) {
		int i=0,j;
		do {
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}while(i<4);

		do {
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}while(i!=-1);
	}

}
