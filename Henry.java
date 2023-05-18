public class Henry
{
	public static int henry(int i, int j)
	{
		int henry = 0;
		int maxValue = Integer.MAX_VALUE;
		int perfectCount = 0;
		int sum = 0;

		for (int n = 1; n <= maxValue; n++)
		{
			sum = 0;
			for (int div = 1; div < n; div++)
			{
				if (n % div == 0)
				{
					sum += div;
				}
			}

			if (n == sum)
			{
				perfectCount++;
			
				if (perfectCount == i)
				{
					henry += sum;
				}
				else if (perfectCount == j)
				{
					henry += sum;
					break;
				}
			}
		}
		return henry;
	}
	public static void main(String[] args)
	{
		System.out.println(henry(1, 4));
	}
}
