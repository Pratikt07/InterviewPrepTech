package Average;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int [size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		int num = sc.nextInt();
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=num) {
				count++;
			}
		}
		System.out.println(count);

	}

}
