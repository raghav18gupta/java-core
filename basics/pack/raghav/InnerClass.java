package pack.raghav;

import pack.raghav.test.Student;

public class InnerClass
{
	public static void main(String[] args)
	{
		Student s = new Student();

		/*
		 Here, public variables of 
		 Student.java are accessible only.  
		*/
		
		System.out.println(s.age);
	}
}
