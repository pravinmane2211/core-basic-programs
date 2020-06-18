package corebasicprograms;

import java.util.Scanner;

public class minmaxchar {
	public static void main(String[] args) {
		System.out.println("enter the String");
		Scanner sc= new Scanner(System.in);
		String s1=sc.nextLine();
		int freq[]=new int[s1.length()];
		 char minchar= s1.charAt(0), maxchar= s1.charAt(0);
		 int i,j,min,max;
		 
		 char String[]=s1.toCharArray();
		 
		 for(i=0;i<String.length;i++) {
			 freq[i]=1;
			 for ( j =i+1; j < String.length; j++) {
				 
				 if (String[i]==String[j] && String[i]!=' '&& String[i]!='0'){
					 freq[i]++;
					 String[j]='0';
				 }
			 }
		 }
					 min=max=freq[0];
					 
					 for (i= 0; i < freq.length; i++) {
						
					 if(min > freq[i] && freq[i]!='0') {
						 min=freq[i];
						 minchar=String[i];
				}
					 
					 if (max<freq[i]) {
						 max=freq[i];
						 maxchar=String[i];
						
					}
				}
					 
					 System.out.println(minchar);
					 System.out.println(maxchar);
					 
		 }
		 
		
		
	}

