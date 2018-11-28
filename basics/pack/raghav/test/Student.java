package pack.raghav.test;

public class Student 
{
	/*
	  1. "default" rollnum is accessible for classes belongs to
	   	 same package, i.e. InnerClass.java and Student.java
	   	 belongs to same folder.
	   	
	  2. "public" age is accessible to everyone.  	 
	   	 
	  3. "private" variables can be access only within
	  	 a class, not even in another class of same file.
	  	 
	  4. "protected" is accessible to 
	  		- class of same package
	  		- class of different package which extends "Student". 
	*/
	
	int rollnum = 9;
	public int age = 20;
	private String name = "Raghav";
	protected int marks = 100;
}
