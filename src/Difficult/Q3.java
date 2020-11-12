package Difficult;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		char a[] = {'!', '#', '$', '%','&','*','@','^','~'};
		char nut[] = {'@','%', '$', '#', '^'};
		char[] bolt = {'%', '@', '#', '$', '^'};
		int index = 0;
		int bindex = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<nut.length;j++) {
				if(a[i]==nut[j]) {
					char temp = nut[index];
					nut[index] = a[i];
					nut[j] = temp;
					index++;
					
				}
				if(a[i]==bolt[j]) {
					char temp = bolt[bindex];
					bolt[bindex] = a[i];
					bolt[j] = temp;
					bindex++;
				}
			}
		}
		
		for(int j=0;j<nut.length;j++) {
				System.out.print(nut[j]+" ");
			}
		System.out.println("");
		for(int j=0;j<nut.length;j++) {
			System.out.print(bolt[j]+" ");
		}

	}

}
