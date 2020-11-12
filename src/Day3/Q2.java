package Day3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a[] = {-6,-5,-4,-3,-1};
		int target = sc.nextInt();
		boolean flag=true;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=target) {
				flag=false;
				System.out.println(i);
				break;
			}
		}
		if(flag) {
			System.out.println(a.length);
		}

	}

}
