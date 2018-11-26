

public class J16_final 
{
	public static void main(String[] args) 
	{
		/*
		 1. final int : to make variable constant.
		 2. final class : to ensure no class can extend your class.
		 3. final method : to ensure that no method can override your method.
		 */
		
		final int a = 10;
		System.out.println(a);
		// a = 11; // Error.
	}
	
}
