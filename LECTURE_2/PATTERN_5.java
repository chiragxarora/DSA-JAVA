package LECTURE_2;

public class PATTERN_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n=4;
		int incval=1;
		int decval=0;
		int nsp=n-1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			int val=row;
			while(cst<=incval) {
				System.out.print(val);
				val++;
				cst++;

				}
			cst=1;
			val=val-2;
			while(cst<=decval) {
				System.out.print(val);
				val--;
				cst++;
			}
				
			row++;
			incval++;
			decval++;
			nsp--;
			System.out.println();
		}
	
	}

}
