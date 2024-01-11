package td_1.tables;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrer la dimension des matrices:");
		int n = sc.nextInt();
		
		int[][] A = new int[n][n];
		int[][] B = new int[n][n];
		System.out.println("Entrer la matrice A:");
		for(int i=0;i<n;i++) {
			System.out.println("Ligne"+i+": ");
			for(int j=0;j<n;j++)
				A[i][j] = sc.nextInt();
		}
		System.out.println("Entrer la matrice B:");
		for(int k=0;k<n;k++) {
			System.out.println("Ligne"+(k+1)+":	");
			for(int l=0;l<n;l++)
				B[k][l] = sc.nextInt();
		}
		
		System.out.println("----------Matrice A:----------");
		show(A,n);
		System.out.println("----------Matrice B:----------");
		show(B,n);
		int [][] s =sum(A,B,n);
		System.out.println("La somme est:	");
		show(s,n);
			
	}
	public static void show(int[][] a,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(a[i][j]+"	");
			System.out.println("");
		}
	}
	public static int[][] sum(int[][] a, int [][] b,int n){
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				a[i][j] =a[i][j]+b[i][j];
		}
		return a;
	}
	/*
	public static int[][] summ(int[][] A, int[][] B,int n){
        int[][] M = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                M[i][j] = A[i][j] + B[i][j];

            }

        }
        return M;
    }
    */
}
