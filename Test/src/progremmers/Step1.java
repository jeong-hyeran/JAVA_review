package progremmers;

import java.util.Scanner;

public class Step1 {
	   public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        String s1 = "";
	        char ch;
	        for (int i = 0; i < a.length(); i++) {
				ch = a.charAt(i);
	        	if(65<=ch&&ch<=90) {
	        		ch+=32;
	        		s1+=ch;
	        	}else if(97<= ch && ch<=122) {
	        		ch-=32;
	        		s1+=ch;
	        	}
			}
	        System.out.println(s1);
	        
	        sc.close();
	    }
}
