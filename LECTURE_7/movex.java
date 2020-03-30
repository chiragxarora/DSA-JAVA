package LECTURE_7;

public class movex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si=0;
		System.out.println(movex("abxxdfxxgxxpqrx"));

	}
	public static String movex(String str) {
		if(str.length()==0) {
			return "";
		}
		
		
		String ans="";
		
		if(str.charAt(0)=='x') {
			String restans=movex(str.substring(1));
			ans=restans+'x';
		}
		else {
			String restans=movex(str.substring(1));
			ans=str.charAt(0)+restans;
		}
		return ans;
		
	}
	

}
