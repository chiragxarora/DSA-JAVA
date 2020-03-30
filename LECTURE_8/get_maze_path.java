package LECTURE_8;
import java.util.ArrayList;

public class get_maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(cmd(2,2,0,0));
		System.out.println(gmd(2,2,0,0));
		//pmd(2,2,0,0,"");
	}
	public static int cmd(int er,int ec,int cr,int cc) {
		if(er==cr&&ec==cc) {
			return 1;
		}
		if(cr>er||cc>ec) {
			return 0;
		}
		int hmove=cmd(er,ec,cr+1,cc);
		int vmove=cmd(er,ec,cr,cc+1);
		int dmove=cmd(er,ec,cr+1,cc+1);
		int c=hmove+vmove+dmove;
		return c;
	}
	public static ArrayList<String> gmd(int er,int ec, int cr, int cc){
		if(cr>er||cc>ec) {
			ArrayList<String> br=new ArrayList();
			return br;
		}
		if(cr==er&&cc==ec) {
			ArrayList<String> br1=new ArrayList();
			br1.add("");
			return br1;
		}
		
		ArrayList<String> hmove=new ArrayList();
		ArrayList<String> vmove=new ArrayList();
		ArrayList<String> dmove=new ArrayList();
		ArrayList<String> ans=new ArrayList();
		hmove=gmd(er,ec,cr+1,cc);
		vmove=gmd(er,ec,cr,cc+1);
		dmove=gmd(er,ec,cr+1,cc+1);
		for(int i=0;i<hmove.size();i++) {
			ans.add("H"+hmove.get(i));
		}
		for(int i=0;i<vmove.size();i++) {
			ans.add("V"+vmove.get(i));
		}
		for(int i=0;i<dmove.size();i++) {
			ans.add("D"+dmove.get(i));
		}
		return ans;
		
		
	}
	public static void pmd(int er,int ec, int cr,int cc,String res) {
		if(cr>er||cc>ec) {
			return;
		}
		if(cr==er&&cc==ec) {
			System.out.println(res);
		}
		pmd(er,ec,cr+1,cc,res+"H");
		pmd(er,ec,cr,cc+1,res+"V");
		pmd(er,ec,cr+1,cc+1,res+"D");
		
	}

}
