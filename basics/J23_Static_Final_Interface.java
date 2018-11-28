interface Demo
{
	int num = 9;	// "final", and need to be assigned her only.
	static void show()
	{
		System.out.println("Static method of Interface");
	}
}

class Follow implements Demo
{
	// num = 10;	/* Error : num is "final" */
}

public class J23_Static_Final_Interface 
{
	public static void main(String[] args) 
	{
		/*
		 1. We can have a variable in Interface, but 
		   	that variable need to be "final", and it is "fianl"
		   	by default
		   	
		 2. We can also have "static" methods in Interface as many
		 	as we want.
		 	 
		 3. So we can access "static" methods of Interface without 
		 	even creating it's object.
		*/
		
		Demo.show();
	}
}
