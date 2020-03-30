package LECTURE_5;

import java.util.Scanner;

public class SPIRAL_PRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		int top=0,left=0,right=(arr[top].length)-1,bottom=arr.length-1;
		int count=(right+1)*(bottom+1);
		while(top<=bottom&&left<=right) {
			int dir=1;
			if(count>0) {
				if(dir==1) {
					for(int i=left;i<=right;i++) {
						System.out.print(arr[top][i]+" ");
						count--;
					}
				}
				dir=2;
				top++;
				
			}
			if(count>0) {
				if(dir==2) {
					for(int j=top;j<=bottom;j++) {
						System.out.print(arr[j][right]+" ");
						count--;
					}
				}
				dir=3;
				right--;
			}
			if(count>0) {
				if(dir==3) {
					for(int k=right;k>=left;k--) {
						System.out.print(arr[bottom][k]+" ");
						count--;
					}
				}
				dir=4;
				bottom--;
			}
			if(count>0) {
				if(dir==4) {
					for(int l=bottom;l>=top;l--) {
						System.out.print(arr[l][left]+" ");
						count--;
					}
				}
				dir=1;
				left++;
			}
		}

		

	}

}
