public class Is121Array
{
	public static int is121Array(int[] a)
	{
		int count = 0;

		if (a[0] != 1 && a[a.length - 1] != 1)
		{
			return 0;
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a.length % 2 == 0)
			{
				if (a[a.length / 2] != 2)
				{
					return 0;
				}
			}
			else
			{
				if (a[(a.length - 1) / 2] != 2)
				{
					return 0;
				}
			}
		}
		int j = 0;

		while (a[j] == 1)
		{
			count++;
			j++;
		}

		int k = a.length - 1;
		int count1 = 0;

		while (a[k] == 1)
		{
			count1++;
			k--;
		}
		
		if (count != count1)
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1};
		int result = is121Array(a);

		System.out.println(result);
	}
}
