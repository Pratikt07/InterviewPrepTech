package Average;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase > 0) {
			int size = sc.nextInt();
			int a[] = new int[size];
			int sum = 0;
			for(int i=0;i<size;i++) {
				a[i] = sc.nextInt();
				
			}
			for(int j=0;j<size/2;j++) {
				int temp = a[j];
				a[j] = a[size-j-1];
				a[size-j-1] = temp;
				
			}
			for(int i : a) {
				System.out.println(i+" ");
			}
			testCase--;
		}

	}

}
