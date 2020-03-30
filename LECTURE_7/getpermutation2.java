package LECTURE_7;

public class getpermutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getp2("abc","");
	}
	public static void getp2(String str, String ss) {
		if(str.length()==0) {
			System.out.println(ss);
			return;
		}
		char cc=str.charAt(0);
		String rest=str.substring(1);
		for(int i=0;i<str.length();i++) {
			
			String sa="";
			for(int j=0;j<str.length();j++)
			{
			if(j!=i) {
				rest+=str.charAt(j);
			}
			}
			
			getp2(rest,ss+str.charAt(i));
		}
	}

}
