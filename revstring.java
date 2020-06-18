package corebasicprograms;

import java.util.Scanner;

public class revstring {
public static void main(String[] args) {
	String rev="";
	
	System.out.println("enter the string:");
	Scanner sc=new Scanner(System.in);
	String s1= sc.nextLine();
	for (int i=s1.length()-1;i>=0;i--) {
		
	System.out.println(s1.length());
		
		rev= rev +s1.charAt(i);
		System.out.println(rev);
		
	}
}
}

