class Outer 	// Outer.class
{
	// variables, methods and class

	int a;

	public void show()
	{
		System.out.print("In Outer ");
		System.out.println(a);
	}

	class Inner 	// Outer$Inner.class
	{
		public void display()
		{
			System.out.print("In Inner ");
			System.out.println(a);
		}
	}
}

class J05_InnerClass	// J05_InnerClass.class
{
	public static void main(String[] args)
	{
		Outer oobj = new Outer();	//obj of Outer
		oobj.show();

		Outer.Inner iobj = oobj.new Inner();	//obj of Inner
		iobj.display();

	}
}