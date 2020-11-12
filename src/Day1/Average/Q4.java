package Average;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		while(testCase > 0) {
			int size = sc.nextInt();
			int a[] = new int[size];
			int sum = 0;
			for(int i=0;i<size;i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			System.out.println(sum);
			testCase--;
		}

	}

}
