class J14_Wrapping_Boxing
{
	public static void main(String[] args)
	{
		/*
		Wrapper classes are slower than premitive datatypes
		But there are some frameworks, which only works 
		with wrapper classes
		*/

		int i = 5;	// premitive datatype

		Integer j = new Integer(5);	// wrapper class
		Float k = new Float(i);	// Boxing or Wrapping

		System.out.println(k.floatValue());	// UnBoxing or UnWrapping
		System.out.println(k);	// AutoUnBoxing or AutoUnWrapping

		/*--------------------*/
		int a = 10;
		Integer b = a;	// AutoBoxing or AutoWrapping
		int c = b;	// AutoUnBoxing or AutoUnWrapping

		/*--------------------*/
		String s = "123";
		int t = Integer.parseInt(s);
	}
}