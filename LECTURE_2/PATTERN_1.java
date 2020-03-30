package LECTURE_2;
import java.util.Scanner;

public class PATTERN_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		int row=1;
		int n=5;
		while(row<=n) {
			int i=1;
			while(i<=(2*row)-1) {
				
				if(i%2==0) {
					System.out.print("*");
				}
				else {
					System.out.print(row);
				}
				i++;
				
			}
			System.out.println();
			row++;
		}

	}

}
