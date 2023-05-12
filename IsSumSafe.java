public class IsSumSafe
{
	public static int isSumSafe(int[] a)
	{
		if (a == null)
		{
			return 0;
		}

		int sum = 0;
		int i = 0;
		int j = 0;

		while (i < a.length)
		{
			sum += a[i];
			i++;
		}

		while (j < a.length)
		{
			if (sum == a[j])
			{
				return 0;
			}

			j++;
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 2, 3, -6, 4};
		int result = isSumSafe(a);

		System.out.println(result);
	}
}


