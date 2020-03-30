package LECTURE_7;

import java.util.ArrayList;

public class getpermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getp("abcde"));
	}
	public static ArrayList<String> getp(String str){
		if(str.length()==0) {
			ArrayList<String> br=new ArrayList<String>();
			br.add("");
			return br;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myresult = new ArrayList<String>();
		ArrayList<String> recresult = getp(ros);
		for(int i=0;i<recresult.size();i++) {
			String recstring= recresult.get(i);
			for(int j=0;j<=recstring.length();j++) {
				String mystring=recstring.substring(0,j)+cc+recstring.substring(j);
				myresult.add(mystring);
			}
		}
		return myresult;
		
				
	}

}
