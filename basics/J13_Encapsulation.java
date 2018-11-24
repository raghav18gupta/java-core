// Encapsulation -> Binding data with methods
class A
{
	private int i;

	public void setter(int i)
	{
		this.i = i;
	}
	public int gettter()
	{
		return i;
	}
}

class J13_Encapsulation
{
	public static void main(String[] args)
	{
		A a = new A();
		a.setter(3);
		System.out.println(a.gettter());
	}
}