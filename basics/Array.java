import java.util.Arrays;	// for line no. 23

class Array
{
	public static void main(String[] args) 
	{
		int a[];	// declare
		a = new int[20];	// memory allocation 

		int[] b = new int[20];	// declaration and memory allocation 

		int[] c = new int[] {1, 2, 3, 4, 5};

		int d[] = {1, 2, 3, 4};

		int e[][] = {{2,7,9}, {3,6,1}, {7,4,2}};

		int f[] = d.clone();	// deep copy
		System.out.println(f == d);	// false

		int g[][] = e.clone();	// shallow copy
		System.out.println(g == e);	// false
		System.out.println(Arrays.equals(g, e));	// true

		ObjArr[] obj = new ObjArr[2];
		obj[0] = new ObjArr();	// That's why, java is hateable
		System.out.println(obj[0].str);

		Pass1D(d);
		Pass2D(e);

		System.out.println(RetArr(e)[1][1]);


	}

	public static void Pass1D(int[] d)
	{
		System.out.println(d[1]);
	}

	public static void Pass2D(int[][] e)
	{
		System.out.println(e[1][1]);
	}

	public static int[][] RetArr(int[][] e)
	{
		return e;
	}

}

class ObjArr
{
	int str = 20;
}