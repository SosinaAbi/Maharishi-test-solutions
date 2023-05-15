 public class IsCentered15
{
	public static int isCentered15(int[] a)
	{
		int startIndex = 0;
		int endIndex = 0;
		int sum = 0;

		if (a.length % 2 != 0)
		{
			startIndex = a.length / 2;
			endIndex = startIndex;
		}
		else
		{
			startIndex = a.length / 2 - 1;
			endIndex = a.length / 2;
		}

		while (startIndex >= 0 && endIndex < a.length)
		{
			sum = 0;
			for (int i = startIndex; i <= endIndex; i++)
			{
				sum += a[i];

				if (sum == 15)
				{
					return 1;
				}
			}
			startIndex--;
			endIndex++;
		}
		return 0;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 6, 3, 6, 3, 1};
		int res = isCentered15(a);

		System.out.println(res);
	}
}

