package LECTURE_1;

import java.util.Scanner;

public class PRIME_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number to be checked :");
		int n = s.nextInt();
		int i=2;
		if(n==1) {
			System.out.println("neither prime nor not prime!!");
			return;
		}
		else if(n==2) {
			System.out.println("prime!!");
			return;
		}
		else {
			while(i<=n/2) {
				if(n%i==0) {
					System.out.println("not prime!!");
					return;
				}
				i++;
			}
			System.out.println("prime!!");
			return;
		}

	}

}
