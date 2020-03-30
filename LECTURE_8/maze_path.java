package LECTURE_8;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cm(2,2,0,0));
	}
	public static int cm(int er , int ec , int cr , int cc) {
		if(cr>er||cc>ec) {
			return 0;
		}
		if(er==cr&&cc==ec) {
			return 1;
		}
		int count=0;
		int ra=cm(er,ec,cr+1,cc);
		int rb=cm(er,ec,cr,cc+1);
		count=ra+rb;
		return count;
			
	}

}