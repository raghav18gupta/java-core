class A 	// Super
{
	A()
	{
		System.out.println("A");
	}
	A(int x)
	{
		super();	/*no error*/
		System.out.println("A int");
	}
}

class B extends A 	// Sub
{
	B()
	{
		super();	/* Every constructor calls super(), even it not written */
		System.out.println("B");
	}
	B(int y)
	{
		super(y);
		System.out.println("B int");
	}
}


class J11_Super
{
	public static void main(String[] args)
	{
		B b = new B(4);
	}
}