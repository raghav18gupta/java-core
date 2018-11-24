class StaticOuter 	// StaticOuter.class
{
	// variables, methods and class

	static int a;

	static public void show()
	{
		System.out.print("In StaticOuter ");
		System.out.println(a);
	}

	static class StaticInner 	// StaticOuter$StaticInner.class
	{
		public void display()
		{
			System.out.print("In StaticInner ");
			System.out.println(a);
		}
	}
}


class J06_StaticInner	// J06_StaticInnerClass.class
{
	public static void main(String[] args)
	{
		StaticOuter soobj = new StaticOuter();	//obj of StaticOuter
		soobj.show();

		StaticOuter.StaticInner siobj = new StaticOuter.StaticInner(); 	//obj of StaticInner
		siobj.display();

	}
}