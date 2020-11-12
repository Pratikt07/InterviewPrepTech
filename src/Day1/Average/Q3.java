package Average;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase>0) {
			int size = sc.nextInt();
			int a[] = new int[size];
			for(int i=0;i<size;i++) {
				a[i] = sc.nextInt();
			}
			int minNum = a[0];
			int maxNum = a[0];
			for(int i=0;i<a.length;i++) {
				if(maxNum<a[i]) {
					maxNum = a[i];
				}
				if(minNum > a[i]) {
					minNum = a[i];
				}
			}
			System.out.println(minNum+" "+maxNum);
			testCase--;
		}
	}

}
