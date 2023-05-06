public class LargestAdjacentSum
{
	public static int largestAdjacentSum(int[] a)
	{
		int sum = 0, prev_sum = 0;
		if (a.length < 2)
		{
			return 0;
		}

		for (int i = 0; i < a.length - 1; i++)
		{
			int j = i + 1;

			sum = a[i] + a[j];

			if (sum > prev_sum)
			{
				prev_sum = sum;
			}

			sum = 0;
		}
		return prev_sum;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 1, 1, 1, 1, 1, 1};
		int result = largestAdjacentSum(a);

		System.out.println(result);
	}
}
