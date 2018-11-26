interface Writer
{
	void write();	// By default, public abstract
}

class Pen implements Writer
{
	public void write()
	{
		System.out.println("I'm Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I'm Pencil");
	}
}

class Kit
{
	public void doSomething(Writer p)
	{
		p.write();
	}
}

public class J17_Interface
{
	public static void main(String[] args) 
	{
		/*
		 * 1. In abstract class we can have "abstract" as well as "normal" methods.
		 * 2. In interface class we have only one kind of class ie. "public abstract".
		 * 3. So we can't define any method in Interface class.
		 * 4. We can't create object of Interface, but we can create reference of it.
		 * 5. We can extend multiple Interfaces, but can't extend multiple Classes.
		 * 6. All the methods in Interface are "public abstract", we don't need to mention it.  
		 */
		
		new Kit().doSomething(new Pen());
		
		new Kit().doSomething(new Pencil());

	}
}
