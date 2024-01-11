package td_1.boucles;

import java.util.Scanner;

public class ex_5 {

	public static void main(String[] args) {

        int f=0,f0=0, f1=1, f2=1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter N:");
        int n = sc.nextInt();
        
        if (n==0) {
            System.out.println(0);
            return;
        }
        if (n==1) {
            System.out.println("0 1");
            return;
        }
        if (n==2) {
            System.out.println("0 1 1");
            return;
        }
        
        System.out.print(f0+" "+f1+" "+f2+" ");
        for (int i = 3; i <=n; i++) {
           f = f1 + f2;
           f1 =f2;
           f2=f;
            System.out.print(f+" ");
        }
	}
}

















/*
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter N: ");
	int n = sc.nextInt();
	
	int[] f = new int[n+1];
	f[0] = 0;
	f[1] = 1;
	for(int i = 2; i<f.length ; i++ ) {
		f[i] = f[i-1]+f[i-2];
	}

	System.out.println(f[n]);
}
*/