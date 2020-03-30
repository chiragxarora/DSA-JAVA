package LECTURE_3;

public class number_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin=100000;
		System.out.println(bintodec(bin));
		int dec=31;
		System.out.println(dectobin(dec));
		int db=2;
		System.out.println(dectoany(dec,db));
		int sb=2;
		int num=111111;
		System.out.println(anytodec(num,sb));

	}
	public static int bintodec(int bin) {
		int sum=0;
		double c;
		int i=0;
		while(bin!=0) {
			int a=bin%10;
			c=Math.pow(2, i);
			sum+=a*c;
			bin/=10;
			i++;
		}
		return sum;
		
	}
	public static int dectobin(int dec) {
		int sum=0;
		double c;
		int i=0;
		while(dec!=0) {
			
			int a=dec%2;
			c=Math.pow(10, i);
			sum+=a*c;
			dec/=2;
			i++;
		}
		return sum;
		
	}
	public static int dectoany(int dec,int db) {
		int sum=0;
		double c;
		int i=0;
		while(dec!=0) {
			
			int a=dec%db;
			c=Math.pow(10, i);
			sum+=a*c;
			dec/=db;
			i++;
		}
		return sum;
	}
	public static int anytodec(int num,int sb) {
		int sum=0;
		double c=0;
		int i=0;
		while(num!=0) {
			int a=num%10;
			c=Math.pow(sb, i);
			sum+=a*c;
			num/=10;
			i++;
		}
		return sum;
	}

}
