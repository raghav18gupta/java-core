package pack.raghav;

import pack.raghav.test.Student;

public class Engineer extends Student
{
	public void show()
	{
		/*
		 Here, protected and public variables of 
		 Student.java are accessible only.  
		*/
		
		marks = 1000;
	}
}
