package LECTURE_2;

public class PATTERN_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int nst=10;
		int nsp=0;
		int n=19;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			if(row<10) {
				System.out.println();
				row++;
				nsp++;
				nst--;
			}
			else {
				System.out.println();
				row++;
				nsp--;
				nst++;
			}
		}

}

}
