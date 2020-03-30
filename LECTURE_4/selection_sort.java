package LECTURE_4;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {50,40,30,20,70,10};
		bs(arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		

	}
	public static void bs(int [] arr) {
		for(int i=0;i<4;i++) {
			int min=i;
			for(int j=i+1;j<5;j++) {
				if(arr[i]>arr[j]) {
					min=j;
				}
				
			}
			int t=arr[min];
			arr[min]=arr[i];
			arr[i]=t;
			
			
			}
		}
	}


