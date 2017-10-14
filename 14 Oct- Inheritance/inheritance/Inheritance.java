package com.bmpl.inheritance;

class Person{
	
	String personName;
	int personId;
	
	Person(){
		personName = "Ram Kumar";
		personId = 1001;
	}
	
	void input(){
	//blank	
	}
	
	void personOutput(){
		System.out.println("Name="+personName);
		System.out.println("Id=" + personId);
	}
	
}

class Student extends Person{
	
	String studName;
	int studRollno;
	
	void studOutput(){
		studName = personName;
		studRollno = personId;
		personOutput();
		System.out.println("Student Name="+studName);
		System.out.println("Student Rollno="+studRollno);
	}		
}

class Employee extends Student{
	
}

public class Inheritance /*extends Student*/{

	public static void main(String[] args) {
		
		
		Person ram = new Student(); //Upcasting
		//ram.studOutput();
		
		//automatically or implicit
		
		
		//Inheritance --> Upcasting and Downcasting
		
		

		//studOutput();
		
	}

}
