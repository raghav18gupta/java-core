class Calc
{
	int a;
	int b;
	int c;

	public void sum()
	{
		c = a+b;
	}
}

class J03_Obj
{
	public static void main(String[] args)
	{
		Calc obj;	//obj=reference
		obj = new Calc();	// new=responsible to allocate memory
							//Calc()=calling constructor which tells how much memory needed
							//new Calc()= collectively as object
		obj.a = 2;
		obj.b = 4;
		obj.sum();
		System.out.println(obj.c);
	}
}