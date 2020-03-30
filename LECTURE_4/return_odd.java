package LECTURE_4;

public class return_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,3,2,5,1};
		System.out.println(ro(arr));

	}
	public static int ro(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans=ans^arr[i];
		}
		return ans;
	}
	
}


