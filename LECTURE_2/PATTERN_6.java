package LECTURE_2;

public class PATTERN_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=10;
		int nsp=n-1;
		int incval=0;
		int decval=0;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int val=10-row+1;
			int cst=1;
			while(cst<=incval) {
				System.out.print(val);
				val++;
				cst++;
			}
			System.out.print(0);
			cst=1;
			val=val-1;
			while(cst<=decval) {
				System.out.print(val);
				val--;
				cst++;
			}
			row++;
			System.out.println();
			nsp--;
			incval++;
			decval++;
		}

	}

}
