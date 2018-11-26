interface Sup11
{
	void abc();
	default void show()
	{
		System.out.println("default show() in Sup11");
	}
}

interface Sup22
{
	default void show()
	{
		System.out.println("default show() in Sup22");
	}
	
}

class Sub1 implements Sup11, Sup22
{
	public void abc()
	{
		System.out.println("defining abc() in Sub");
	}
	
	/* This is Method Two : mention which super?*/
	@Override
	public void show()
	{
		Sup11.super.show();
	}
}

class J22_Multiple_Inheritence
{
	public static void main(String[] args) 
	{
		/*Two ways to achive Multiple_Inheritence*/
		Sub1 s = new Sub1();
		s.abc();
		s.show();
	}
}