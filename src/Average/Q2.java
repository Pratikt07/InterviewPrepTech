package Average;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase>0) {
			int size = sc.nextInt();
			int ar[] = new int[size];
			for(int i=0;i<size;i++) {
				ar[i]= sc.nextInt();
			}
			int max = 0;
			int max2 = 0;
			for(int i=0;i<ar.length;i++) {
				if(max<ar[i]) {
					max2 = max;
					max = ar[i];
				}
				else if(max2<ar[i] && ar[i]!=max) {
					max2 = ar[i];
				}
			}
			System.out.println(max2);
			testCase--;
		}

	}

}
