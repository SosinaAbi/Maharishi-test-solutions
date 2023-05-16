public class Matches
{
	public static int matches(int[] a, int[] p)
	{
		int len = 0;
		int start = 0;
		int end = 0;

		for (int i = 0; i < p.length; i++)
		{
			if (p[i] < 0)
			{
				len = -1 * p[i];
			}
			else
			{
				len = p[i];
			}

			end = start + len;

			for (int j = start; j < end; j++)
			{
				if ((p[i] < 0 && a[j] > 0) || (p[i] > 0 && a[j] < 0))
				{
					return 0;
				}
			}
			start = end;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, -2, -2, 2, 5, 7};
		int[] p = {2, 1, -1, -1, 3};
		int res = matches(a, p);
		System.out.println(res);
	}

}
