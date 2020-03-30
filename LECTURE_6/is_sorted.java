package LECTURE_6;

public class is_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,4};
		int i=0;
		System.out.println(is_sorted(arr,i));

	}
	public static boolean is_sorted(int[] arr, int i) {
		boolean x=false;
		if(i==arr.length-1) {
			return true;
		}
		int a=arr[i];
		int b= arr[i+1];
		
		if(a<b) {
			x= true;
			is_sorted(arr,i+1);
		}
		else {
			x=false; 
		}
		return x;
		
		
		
		
		
	}

}
