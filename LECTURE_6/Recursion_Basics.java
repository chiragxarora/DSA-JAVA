package LECTURE_6;

public class Recursion_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pdiskip(7);
		//System.out.println(fact(1));
		System.out.println(power(2,0));
		System.out.println(fib(6));
	}
	public static void pdiskip(int n) {
		
		if(n==0) {
			return;
		}
	
		if(n%2==1) {
			System.out.println(n);
		}
		pdiskip(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
		
	}
	public  static int fact(int n) {
		
		if(n==0) {
			return 1;
		}
		
		n*=fact(n-1);
		return n;
	}
	public static int power(int x,int y) {
		
		if(y==0) {
			return 1;
		}
		
		x*=power(x,y-1);
		return x;
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		n=fib(n-1)+fib(n-2);
		return n;
		
	}

}
