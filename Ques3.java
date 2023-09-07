package day1;



public class Ques3 {

	static String collgename="nallamuthu gounder mahalingam college";
	int rollno;
	String stuname;
	
	static void change() {
		collgename="BIT";
		
	}
	
	 fpublic Ques3 (int rollno,String stuname){
		
	this.rollno=rollno;
	this.stuname=stuname;
	
	
		System.out.println(rollno+" "+stuname+" "+collgename);
		
		
	}
	

	
	public static void main(String[] args) {
		Ques3.change();
		Ques3 s=new Ques3(1,"raji");
		
		Ques3 s1=new Ques3(2,"aji");
	
}}
