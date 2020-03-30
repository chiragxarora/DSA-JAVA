package LECTURE_2;
import java.util.Scanner;

public class PATTERN_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		int row=1;
		int n=4;
		int num=1;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				System.out.print(num);
				num++;
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
