package day1;
import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		//Have a variable store an integer. Create an if statement to find out if it's an even number. 
		   Scanner s = new Scanner(System.in);
    	   System.out.println("enter the number");

           int a=s.nextInt();

           if(a%2==0) {
        	   System.out.println("even number");
           }
           
           if(a%2==1) {
        	   System.out.println("odd number");
           }
	}
	
	

}
