package LECTURE_1;

import java.util.Scanner;

public class REVERSE_A_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number to be reversed");
		int n = s.nextInt();
		int rev=0;
		for(int i=n;i>0;i/=10) {
			int a = i%10;
			rev*=10;
			rev+=a;
			
		}
		System.out.print(rev);

	}

}
