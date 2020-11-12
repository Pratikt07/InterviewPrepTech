package Difficult;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		Set<Integer> union = new HashSet<Integer>();
		System.out.println("LinkedList-1 values : ");
		int num =0 ;
		while(true) {
			num = sc.nextInt();
			if(num==-1) {
				break;
			}
			l1.add(num);
			union.add(num);
		}
		System.out.println("LinkedList-2 values : ");
		while(true) {
			num = sc.nextInt();
			if(num==-1) {
				break;
			}
			l2.add(num);
			union.add(num);
		}
		Iterator<Integer> it = union.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
	}

}
