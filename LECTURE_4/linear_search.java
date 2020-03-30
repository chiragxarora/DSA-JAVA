package LECTURE_4;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,4,5,6,6,7,8};
		int d=0;
		System.out.println(ls(arr,d));

	}
	public static int ls(int []arr,int d ) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==d) {
				return i;
			}
		}
		return -1;
	}

}
