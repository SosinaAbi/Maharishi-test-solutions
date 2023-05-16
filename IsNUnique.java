public class IsNUnique
{
	public static int isNUnique(int[] a, int n)
	{
		int count = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] + a[j] == n)
				{
					count++;
				}
			}
		}
		if (count != 1)
		{
			return 0;
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 9, 3, 2};
	        int res = isNUnique(a, 5);

		System.out.println(res);
	}
}
