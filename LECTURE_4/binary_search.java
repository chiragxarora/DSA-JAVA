package LECTURE_4;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,15,20,20,20,30,40};
		int data=11;
		System.out.println(bs(arr,data));

	}
	public static int bs(int []arr,int data) {
		int start=0,ans=-1;
		int end=(arr.length-1);
		while(start<=end) {
			
			int mid=(start+end)/2;
			if(arr[mid]==data) {
				ans= mid;
				end=mid-1;
				
			}
			else if(arr[mid]>data) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
			
		}
		return ans;
	}

}
