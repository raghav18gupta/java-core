@FunctionalInterface	//optional to write it
interface Abd
{
	void show();
	//void thow(); // Error: Abd will no @FunctionalInterface anymore 
}

@FunctionalInterface
interface Abde
{
	void whow();
}

public class J19_Lambda_Expr 
{
	public static void main(String[] args) 
	{
		/*
		  Types of Interfaces:
		  1. Normal Interface - More than one Abstract Methods
		  2. Functional Interface - Single Abstract Method(SAM)
		  3. Marker Interface - No Abstract Method
		*/
		
		/* Two ways of writing lambda expression: */
		
		Abd x = () -> System.out.println("First Way");	//Best standard way
		
		Abde y = new Abde() 
					{
						@Override	//optional to write it
						public void whow() 
						{
							System.out.println("Another Way");
						}
					};
		x.show();
		y.whow();
	}
}