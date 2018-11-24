class J01_Var
{
	public static void main(String[] args)
	{
		byte a = 1; // 1 Byte, -128 to 127
		short b = 2; // 2 Byte, -32768 to 32767
		int c = 4; // 4 Byte, -2147483648 to 2147483647
		long d = 8; // 8 Bytes, -2.305843009×10¹⁸ to 2.305843009×10¹⁸

		float e = 5.5f;	//4 Bytes
		double f = 5.5;

		char g = 'A';
		g++; // 'B'

		double x = 5; // implicit conversion
		int y = (int)5.6f; // explicit conversion

		String z = "raghav";
		switch(z)	//works wtih string as well
		{
			case "Raghav":
				System.out.println("1");
				break;
			case "raghav":
				System.out.println("2");
				break;
			default:
				System.out.println("3");
		}
	}
}

/*
byte -> short -> int -> long -> float -> double
		    char -^
*/