package Difficult;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<Integer> row1 = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();
		one :
		for(int i=0; i<N;i++) {
			two :
			for(int j=0;j<N;j++) {
				
				boolean flag = false;
				if(i==0) {
					int num = sc.nextInt();
					row1.add(num);
				}else if(i==1) {
					int num = sc.nextInt();
					if(row1.contains(num)) {
						common.add(num);
					}
					else if(common.contains(num)) {
						common.remove(num);
						
					}
					
				}
				else {
					Set<Integer> row2 = new HashSet<Integer>();
					for(int k = 0;k<N;k++) {
						int num = sc.nextInt();
						row2.add(num);
					}
					Iterator<Integer> it = common.iterator();
					while(it.hasNext()) {
						if(row2.contains(it.next())) {
							flag = true;
						}else {
							it.remove();
						}
					}
					break two;
				}
				
			}
		}
		
		System.out.println(common.size());

	}

}
