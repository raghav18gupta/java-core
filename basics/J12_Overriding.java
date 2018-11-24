class A 	// Super
{
	public void show()
	{
		System.out.println("show-A");
	}
}

class B extends A 	// Sub
{
	public void show()	//override
	{
		System.out.println("show-B");
	}
	public void Uncallable()	// Uncallable
	{
		System.out.println("Uncallable-B");	
	}
}

class J12_Overriding
{
	public static void main(String[] args)
	{
		/* b is reference of A, but points object of B*/
		A b = new B(); 
		b.show();	// Overriding

		/* If you have reference of Superclass and object of subclass,
		 you can only call which are in Super class */
		b.Uncallable();	//Error, Uncallable


		A x = new A();	// runtime polymorphism
		x.show();

		x = new B();	// dynamic method dispatch
		x.show();
	}
}