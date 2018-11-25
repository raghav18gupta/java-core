abstract class A_phone
{
	void call()
	{
		System.out.println("calling");
	}
	abstract void move();
	abstract void cook();
	abstract void fuck();
}

abstract class B_phone extends A_phone
{
	void move()
	{
		System.out.println("moving");
	}
}

class C_phone extends B_phone
{
	void cook()
	{
		System.out.println("cooking");
	}
	void fuck()
	{
		System.out.println("fucking");
	}
}

class J15_Abstract
{
	public static void main(String[] args)
	{

		C_phone z = new C_phone();
		z.call();
		z.move();
		z.cook();
		z.fuck();

		
		/*
		1. when you don't want to define method you can make it abstract.
		2. class need to be abstract if it has abstract method.
		3. when a class extend abstract class, we must make sure
		   that we have define the abstract method.
		4. Human(abstract class, super class), extended by 
		   Man(concrete class, sub class)
		5. Abstract Methods can only be declared, not defined.
		6. Abstract class can have abstract method.
		7. You can't create object of abstract class.
		*/
	}
}