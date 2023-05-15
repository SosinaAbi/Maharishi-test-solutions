public class IsDivisible
{
	public static int isDivisible(int[] a, int divisor)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % divisor != 0)
			{
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 3, 4, 8};
		int res = isDivisible(a, 2);

		System.out.println(res);
	}
}
