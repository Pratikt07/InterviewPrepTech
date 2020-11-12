package Day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//char [] cs = {'a','c','d','c','b'};
		char [] cs = s.toCharArray();
		String pattern = sc.next(); 
		//char[] cp = {'a','*','c','?','b'};
		char[] cp =	pattern.toCharArray();
		int i=0,j=0;
		
		main :
		for( i=0,j=0;i<cs.length && j<cp.length;) {
			if(cp[j]==cs[i]) {
				i++;
				j++;
				continue;
			}
			else if(cp[j]=='?') {
				i++;
				j++;
				continue;
			}
			else if(cp[j]=='*') {
				j++;
				if(j<cp.length) {
					boolean flag=true;
					for(int k=i;k<cs.length ;k++) {
						if(cs[k]==cp[j]) {
							i=k;
							flag=false;
							break;
						}
						
					}
					if(flag) {
						System.out.println("false");
						return;
					}
				}else {
					if(j==cp.length && cp[j-1]=='*') {
						System.out.println("true");
						return ;
					}
					i++;
					break;
				}
				
			}
			else {
				System.out.println("false");
				return;
			}
			
		}
		if(i==cs.length && j==cp.length) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
