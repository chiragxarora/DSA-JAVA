package LECTURE_2;

public class PATTER_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=1;
		int n = 5;
		while(row<=n) {
			int i =1;
			while(i<=(2*row)) {
				System.out.print(" ");
				i++;
			}
			int k=5;
			while(k>=row) {
				System.out.print("*");
				k--;
			}
			row++;
			System.out.println();
		}

	}

}
