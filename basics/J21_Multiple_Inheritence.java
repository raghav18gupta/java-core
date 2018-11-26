interface Sup1
{
	void abc();
	default void show()
	{
		System.out.println("default show() in Sup1");
	}
}

interface Sup2
{
	default void show()
	{
		System.out.println("default show() in Sup2");
	}
	
}

class Sub implements Sup1, Sup2
{
	public void abc()
	{
		System.out.println("defining abc() in Sub");
	}
	
	/* This is Method One */
	public void show()
	{
		System.out.println("Method One");
	}
}

class J21_Multiple_Inheritence
{
	public static void main(String[] args) 
	{
		/*Two ways to achive Multiple_Inheritence*/
		Sub s = new Sub();
		s.abc();
		s.show();
	}
}