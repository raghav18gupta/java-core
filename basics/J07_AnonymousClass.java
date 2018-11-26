class Ano
{
	public void show()
	{
		System.out.println("In  a  Anon  ");
	}
}

/*
class Extn
{
	public void show()
	{
		System.out.println("In  a  Extn  ");
	}
} 
*/

class J07_AnonymousClass
{
	public static void main(String[] args)
	{
		/*
		 Class Extn only overrides methods of Ano
		 So Instead of making seperate class "Extn"
		 we can make anonymous class, which can be used once. 
		*/
		
		Ano a = new Ano()
					{
						public void show()
						{
							System.out.println("Overridden!!!");
						}
					};
		a.show();
	}
}