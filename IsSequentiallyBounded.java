public class IsSequentiallyBounded
{
	public static int isSequentiallyBounded(int[] a)
	{
		int appearCount = 0;
		int element = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (element <= 1 || a[i] <= 1)
			{
				return 0;
			}
			if (element == a[i])
			{
				appearCount++;
				continue;
			}
			else
			{
				if (element > a[i])
				{
					return 0;
				}
				if (appearCount + 1 >= element)
				{
					return 0;
				}

				element = a[i];
				appearCount = 0;
			}
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] array = {2, 3, 3, 2};
		int result = isSequentiallyBounded(array);
		System.out.println(result);
	}
}
