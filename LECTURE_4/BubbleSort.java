package LECTURE_4;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 99, 88, 77, 66, 55 };
		BubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	public static void BubbleSort(int[] arr) {

		for (int count = 0; count < arr.length - 1; count++) {

			for (int j = 0; j < arr.length - 1 - count; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
	}

}
