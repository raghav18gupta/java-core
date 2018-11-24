class Cals
{
	public int add(int ... n)	//{1,2,3}
	{
		int sum = 0;
		for(int i : n)
			sum += i;
		return sum;
	}

	public void display(String ... n)
	{
		for(String i : n)
		{
			System.out.println(i);
		}
	}
}

class J09_VarArg
{
	public static void main(String[] args)
	{
		Cals c = new Cals();
		int x[] = {1,2,3,4};
		System.out.println(c.add(x));

		String y[] = {"Raghav", "Gupta"};
		c.display(y);
	}
}