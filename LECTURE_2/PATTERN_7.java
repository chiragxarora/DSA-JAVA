package LECTURE_2;

public class PATTERN_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int num=5;
		int nst=0;
		int n=5;
		while(row<=n) {
			int nump=1;
			while(nump<=num) {
				System.out.print(nump);
				nump++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("*");
				cst++;
			}
			row++;
			nst=(2*(row-1))-1;
			num--;
			System.out.println();
		}

	}

}
