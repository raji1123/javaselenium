package day1;

import java.util.Scanner;

public class Q4 {//Write a java program to get 2 numbers from the user and swap their values without any 

	
		public static void main(String[] args) {
			   Scanner s = new Scanner(System.in);
	           System.out.println("enter a,b");
	           int a=s.nextInt();
	           int b=s.nextInt();
	          int c=a;//intialize from right side
	        
	          a=b;
	          b=c;
	          
	          
	           
	           System.out.println(a);
	           System.out.println(b);

}}
