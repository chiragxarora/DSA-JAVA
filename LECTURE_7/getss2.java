package LECTURE_7;

public class getss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		getss2(str,"");
	}
	public static void getss2(String str,String ss) {
		if(str.length()==0) {
			System.out.println(ss);
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		getss2(ros,ss);
		getss2(ros,ss+cc);
					
	}

}
