class A 	// Super
{
	public int sum(int i, int j)
	{
		return i+j;
	}
}

class B extends A 	// Sub
{
	public int sub(int i, int j)
	{
		return i-j;
	}
}

class C extends B
{
	public int mul(int i, int j)
	{
		return i*j;
	}
}

class J10_Inheritence
{
	public static void main(String[] args)
	{
		C b = new C();
		System.out.println(b.sum(1, 2));
		System.out.println(b.sub(1, 2)); 
	}	
}