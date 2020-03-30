package LECTURE_7;

import java.util.*;

public class getss {
int c=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		System.out.println(getss(str));
	}
	public static ArrayList<String> getss(String str){
		if(str.length()==0) {
			ArrayList<String> br= new ArrayList<>();
			br.add("");
			return br;
		}
		
		
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myresult = new ArrayList<String>();
		ArrayList<String> recresult = getss(ros);
		for(int i=0;i<recresult.size();i++) {
			myresult.add(recresult.get(i));
			myresult.add(cc+recresult.get(i));
		}
		return myresult;
	}

}
