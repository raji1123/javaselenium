package day1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO whether the senior citizen or not
		Scanner s = new Scanner(System.in);      	  
		System.out.println("enter the number");
   	   int a=s.nextInt();
   	   if(a>18) {
   		System.out.println("senior citizen");
   	   }
   	   else
   		System.out.println("Not a senior citizen");
	}

}
