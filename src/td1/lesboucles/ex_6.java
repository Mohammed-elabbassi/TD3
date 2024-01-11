package td_1.boucles;

public class ex_6 {

	public static void main(String[] args) {
		
		System.out.println("Les possibilités sont:");
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				for(int k=1;k<10;k++) {
					if(i+j+k == 15)
						System.out.println(i+","+j+","+k);
				}
			}
		}

	}

}