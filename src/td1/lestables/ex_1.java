package td_1.tables;

import java.util.Random;

public class ex_1 {

	public static void main(String[] args) {
		
		int[] T = new int[5];
		
		Random random = new Random();
		for (int i = 0; i < T.length; i++) {
            T[i] = random.nextInt(99); // Generates integers from 0 to 100 (exclusive)
        }
		int max,min;
		max = min = T[0];
		for(int i = 1 ; i < T.length ; i++) {
			if(T[i]<min)
				min = T[i];
			if(T[i]>max)
				max = T[i];
		}
		for(int s : T) {
			System.out.print(s);
		}
		System.out.println("Le maximum est: "+max);
		System.out.println("Le minimim est: "+min);
		
		
	}

}
