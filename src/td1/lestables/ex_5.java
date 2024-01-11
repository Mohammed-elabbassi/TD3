package td_1.tables;

public class ex_5 {

	public static void main(String[] args) {

		char[] t = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};
		
		System.out.print("Avant:	");
		for(char c: t)
			System.out.print(c+" ");
		
		char pElement = t[0];
		for(int i=0;i<t.length-1;i++) {
			t[i] = t[i+1];
		}
		t[t.length-1] = pElement;
		
		System.out.println();
		System.out.print("Apres:	");
		for(char c: t)
			System.out.print(c+" ");
	}

}
