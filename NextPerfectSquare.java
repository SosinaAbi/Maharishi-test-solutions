public class NextPerfectSquare
{
	public static int nextPerfectSquare(int n)
	{
		int nextPerfectSquare  = 0;

		if (n == 0)
		{
			nextPerfectSquare = 1;
		}
		else if(n < 0)
		{
			nextPerfectSquare = 0;
		}

		for (int i = 1; i < n; i++)
		{
			if (i * i > n)
			{
				nextPerfectSquare = i * i;
				break;
			}
		}

		/*int sqrtResult = (int) Math.sqrt(n);
		int nextSqrt = sqrtResult + 1;
		int nextPerfectSquare1 = (int) Math.pow(nextSqrt, 2);
		return nextPerfectSquare1;*/

		return nextPerfectSquare;
	}

	public static void main(String[] args)
	{
		System.out.println(nextPerfectSquare(36));
	}
}

