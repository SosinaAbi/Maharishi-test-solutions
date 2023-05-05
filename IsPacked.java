public class IsPacked
{
	public static int isPacked(int[] a)
	{
		int appearCount = 0;
		int element = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (element <= 0 || a[i] <= 0)
			{
				return 0;
			}
			if (element != a[i])
			{
				int j = i + 1;
				while (j < a.length)
				{
					if (element == a[j])
					{
						return 0;
					}
					j++;
				}
				if (appearCount + 1 != element)
				{
					return 0;
				}
				appearCount = 0;
				element = a[i];
			}
			else
			{
				appearCount++;
			}
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {7, 7, 7, 3, 3, 3, 7, 7, 7, 7};
		int result = isPacked(a);

		System.out.println(result);
	}
}
