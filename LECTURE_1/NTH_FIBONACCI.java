package LECTURE_1;

import java.util.Scanner;

public class NTH_FIBONACCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  number : ");
		int n = s.nextInt();
		int fn=0;
		int sn=1;
		int t;
		for(int i=1;i<=n;i++) {
			t=fn+sn;
			fn=sn;
			sn=t;
		}
		System.out.println(fn);

	}

}
