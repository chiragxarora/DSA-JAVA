package LECTURE_4;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {50,40,30,20,10};
		is(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}
	public static void is(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0&&arr[j]<arr[j-1];j--) {
				int t =arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=t;
			}
		}
	}

}
