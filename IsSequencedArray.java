public class IsSequencedArray
{
	public static int isSequencedArray(int[] a, int m, int n)
	{
		if (a[0] != m || a[a.length - 1] != n)
		{
			return 0;
		}

		for (int i = 0, j = 1; i < a.length - 1; i++, j++)
		{
			if (a[j] == a[i])
			{
				continue;
			}
			else if (a[j] != a[i] + 1)
			{
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {2, 3, 4, 5, 6};
		int result = isSequencedArray(a, 2, 5);
		System.out.println(result);
	}
}
