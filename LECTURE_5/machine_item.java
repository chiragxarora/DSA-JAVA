package LECTURE_5;
import java.util.*;
public class machine_item {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 3;
		int[] machines=new int [n];
		int goal=10;
		for(int i=0;i<n;i++) {
			machines[i]=s.nextInt();
		}
		Arrays.sort(machines);
		int low=machines[0];
		int ans=111110;
		int high=machines[machines.length-1]*goal;
		
		while(low<high) {
			int items=0;
			int days=(low+high)/2;
			for(int i=0;i<machines.length;i++) {
				items+=days/machines[i];
			}
			System.out.println(days+" "+items);
			if(items>goal) {
				ans=days;
				high=days;
			}
			if(items<goal){
				low=days+1;
			}
			if(items==goal) {
				ans=days;
				high=days;
			}
			
		}
		System.out.println(ans);
		
			
			
		}

	}


