public class IsMinMaxDisjoint
{
	public static int isMinMaxDisjoint(int[] a)
	{
		int min = a[0];
		int max = a[0];
		int minCount = 0, maxCount = 0, k = 0;

		for (int i = 1; i < a.length; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
			if (a[i] < min)
			{
				min = a[i];
			}
		}

		if (min == max)
		{
			return 0;
		}

		while (k < a.length)
		{
			if (a[k] == min)
			{
				minCount++;
			}
			if (a[k] == max)
			{
				maxCount++;
			}
			k++;
		}
		if (minCount > 1 || maxCount > 1)
		{
			return 0;
		}
		for (int i = 0; i < a.length - 1; i++)
		{
			if ((min == a[i] && max == a[i + 1]) || (max == a[i] && min == a[i + 1]))
			{
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 1, 3, 1, 2, 4};
		int result = isMinMaxDisjoint(a);
		System.out.println(result);
	}
}
