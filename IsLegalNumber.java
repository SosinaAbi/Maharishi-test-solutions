public class IsLegalNumber
{
	public static int isLegalNumber(int[] a, int base)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] >= 0)
			{
				if (a[i] >= base)
				{
					return 0;
				}
			}
			else
			{
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {0, 2, 1};
		int res = isLegalNumber(a, 3);

		System.out.println(res);
	}
}
