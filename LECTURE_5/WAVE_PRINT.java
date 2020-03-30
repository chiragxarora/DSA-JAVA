package LECTURE_5;
import java.util.*;
public class WAVE_PRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] arr= {{11,12,13,14},{21,22,23},{31,32,33,34},{41,42,43,44}};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int k=arr[i].length-1;k>=0;k--) {
					System.out.print(arr[i][k]+" ");
				}
			}
		}

	}

}
