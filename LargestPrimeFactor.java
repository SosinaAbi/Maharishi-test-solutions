public class LargestPrimeFactor
{
	public static int largestPrimeFactor(int n)
	{
		int prevFactor = 2;

		if (n <= 1)
		{
			return 0;
		}

		while (n != 1)
		{
			if (n % prevFactor == 0)
			{
				n /= prevFactor;
			}
			else
			{
				prevFactor++;
			}
		}

		return prevFactor;
	}

	public static void main(String[] args)
	{
		System.out.println(largestPrimeFactor(6936));
	}
}
