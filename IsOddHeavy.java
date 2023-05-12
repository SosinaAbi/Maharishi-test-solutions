public class IsOddHeavy
{
	public static int isOddHeavy(int[] a)
	{
		int odd = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 != 0)
			{
				odd = a[i];
				for (int j = 0; j < a.length; j++)
				{
					if (a[j] % 2 == 0)
					{
						if (odd < a[j])
						{
							return 0;
						}
					}
				}
			}
		}
		if (odd == 0)
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {-2, -4, -6, -8, -11};
		int result = isOddHeavy(a);

		System.out.println(result);
	}
}
