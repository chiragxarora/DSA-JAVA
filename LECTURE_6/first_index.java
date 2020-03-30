package LECTURE_6;

public class first_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,3,4,8,3,4};
		int data=4;
		int si=0;
		System.out.println(first_index(arr,si,data));

	}
	public static int first_index(int[] arr,int si,int data) {
		if(si==arr.length) {
			return -1;
		}
		
		
		if(arr[si]==data) {
			return si;
		}
		else {
			int a=first_index(arr,si+1,data);
			return a;
		}
	}

}
