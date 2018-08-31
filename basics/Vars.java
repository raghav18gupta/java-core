class Vars
{
	public void LocalVar()
	{
		//A variable defined within a block or method or constructor is called local variable.
		// These variable are created when the block in entered or the function is called and destroyed after exiting from the block or when the call returns from the function.
		// The scope of these variables exists only within the block in which the variable is declared. i.e. we can access these variable only within that block.
		int loc = 10;
		System.out.println("Local var = " + loc);
	}


	public static void main(String[] args) 
	{
		Vars locl = new Vars();
		locl.LocalVar();

		InstanceVar inst = new InstanceVar();
		inst.instvar = "Raghav Gupta";
		System.out.println(inst.instvar);

		StaticVar stat = new StaticVar();
		System.out.println(StaticVar.bool);
		System.out.println(stat.bool);
	}
}

class InstanceVar
{
	// Instance variables are non-static variables and are declared in a class outside any method, constructor or block.
	// As instance variables are declared in a class, these variables are created when an object of the class is created and destroyed when the object is destroyed.
	// Unlike local variables, we may use access specifiers for instance variables. If we do not specify any access specifier then the default access specifier will be used.
	String instvar;
}

class StaticVar
{
	static boolean bool = true;
}