public class IsVanilla
{
	public static int isVanilla(int[] a)
	{
		if (a == null)
		{
			return 0;
		}

		int testDigit = a[0] % 10;
		int tempElement = 0;
		int element = 0;

		for (int i = 0; i < a.length; i++)
		{
			element = a[i];

			while (element != 0)
			{
				tempElement = element % 10;

				if (testDigit != tempElement)
				{
					return 0;
				}

				element /= 10;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 111, 11};
		int res = isVanilla(a);

		System.out.println(res);
	}
}

