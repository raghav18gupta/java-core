import java.util.Arrays;

class DeepShallowComp
{
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 3};
		int b[] = {1, 2, 3};

		int x[][] = {a};
		int y[][] = {b};
		System.out.println(x == y);	// false
		System.out.println(Arrays.equals(x, y));	// false, shallow comp
		System.out.println(Arrays.deepEquals(x, y));	// true, deep comp
	}
}