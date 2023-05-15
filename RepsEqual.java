public class RepsEqual
{
	public static int repsEqual(int[] a, int n)
	{
		int i = a.length - 1;

		while (n != 0)
		{
			if (n % 10 != a[i])
			{
				return 0;
			}
			
			n /= 10;
			i--;
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4};
		int res = repsEqual(a, 123);

		System.out.println(res);
	}
}
