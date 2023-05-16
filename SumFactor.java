public class SumFactor
{
	public static int sumFactor(int[] a)
	{
		int sum = 0;
		int sumFactor = 0;

		for (int i = 0; i < a.length; i++)
		{
			sum += a[i];
		}

		for (int i = 0; i < a.length; i++)
		{
			if (sum == a[i])
			{
				sumFactor++;
			}
		}

		return sumFactor;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, -3, 5, 1, 6, -6};
		int res = sumFactor(a);

		System.out.println(res);
	}
}
