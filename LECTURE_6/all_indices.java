package LECTURE_6;

public class all_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,3,4,8,3,4};
		int data=3;
		int si=0;
		int count=0;
		int[] ar=ai(arr,si,data,count);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}
	public static int[] ai(int[] arr,int si, int data, int count) {
		int[] indices=null;
		if(si==arr.length) {
			indices= new int [count];
			return indices;
		}
		
		if(arr[si]==data) {
			indices=ai(arr,si+1,data,count+1);
		}
		else {
			indices=ai(arr,si+1,data,count);
		}
		
		if(arr[si]==data) {
			indices[count]=si;
		}
		return indices;
		
	}

}
