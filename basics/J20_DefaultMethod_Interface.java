@FunctionalInterface
interface DefIntface
{
	void how();
	default void show()
	{
		System.out.println("show");
	}
	default void whow()
	{
		System.out.println("Definig Method in Interface like a pro");
	}
}

class Ex implements DefIntface
{
	public void how()
	{
		System.out.println("public abstract method defined ");
	}
	
	public void show()
	{
		System.out.println("default method overriden");
	}
}

public class J20_DefaultMethod_Interface 
{
	public static void main(String[] args)
	{
		/*
		 1. In newer version of Java, we can define a method 
		    in IInterface as well.
		     
		 2. That method should be "default" not "public".
		 
		 3. Even FunctionalInterface can have 
		 	a "undeclared public abstract" method and 
		 	more than one "declared default abstract" method.
		 	 
		 4. "default abstract" methods can also be overridden.
		*/
		
		Ex e = new Ex();
		e.show();
		e.how();
		e.whow();
	}
}
