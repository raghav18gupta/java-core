class Emp
{
	int eid;
	int sal;
	static String ceo;

	/* It doesn't matter how many object you create, Static block called ones */
	/* It is like constructor, but runs only first time */
	/* So to init non-static vars: constructor, and to init static vars: static blocks */

	// called when you load a class
	static
	{
		// eid = 0;	//can't access non-static var in static block
		ceo = "Modi";
		System.out.println("Mitro");
	}

	// called when you reate a object
	Emp()
	{
		eid = 0;
		sal = 0;
	}
}

class J04_static
{
	public static void main(String[] args)
	{
		System.out.println(Emp.ceo);		
		System.out.println(Emp.ceo);		
	}
}