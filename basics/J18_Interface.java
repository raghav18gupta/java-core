interface Inter
{
	void show();
}

class Imple implements Inter
{
	public void show()
	{
		System.out.println("in Imple");
	}
}

public class J18_Interface 
{
	public static void main(String[] args)
	{
		/*
		 * Only way to create object is to implement a class 
		 */
		
		Inter a = new Imple();
		a.show();
	}
}
