package LECTURE_6;

public class last_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,3,4,8,3,4};
		int data=4;
		int si=0;
		System.out.println(last_index(arr,si,data));

	}
	public static int last_index(int[]arr,int si,int data) {
		int index;
		if(si==arr.length) {
			return -1;
		}
		index=last_index(arr,si+1,data);
		if(index!=-1) {
			return index;
		}
		else {
			if(arr[si]==data) {
				return si;
			}
			else {
				return -1;
			}
		}
	}
	

}
