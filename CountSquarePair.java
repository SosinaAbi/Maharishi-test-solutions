public class CountSquarePair
{
	public static int countSquarePair(int[] a)
	{
		int count = 0;

		if (a.length > 1)
		{
			for (int i = 0; i < a.length; i++)
			{
				for (int j = i + 1; j < a.length; j++)
				{
					if (isPerfectSquare(a[i] + a[j]) == 1)
					{
						if (a[i] != a[j] && a[i] > 0 && a[j] > 0)
						{
							count++;
						}
					}
				}
			}
		}
		return count;
	}

	public static int isPerfectSquare(int n)
	{
		for (int i = 1; i < n; i++)
		{
			if (i * i == n)
			{
				return 1;
			}
			else if (i * i > n)
			{
				break;
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] a = {9};
		int res = countSquarePair(a);

		System.out.println(res);
	}
}
