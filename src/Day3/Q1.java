package Day3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "aa";
		char [] cs = s.toCharArray();
		String pattern = "a"; 
		char[] cp = pattern.toCharArray();
		for(int i=0,j=0;i<cs.length;) {
			if(cp[j]=='*') {
				j++;
				for(int k=0;k<cs.length;k++) {
					if(cs[i]==cp[j])
				}
				continue;
			}
			else if() {
				
			}
		}

	}

}
