public class Solve10
{
	public static int[] solve10()
	{
		int tenFactorial = 1;
		int x = 0;
		int y = 0;
		int[] solve10 = new int[2];
		boolean factorialFound = false;

		for (int i = 1; i <= 10; i++)
		{
			tenFactorial *= i;
		}

		for (y = 1; y < 10; y++)
		{
			int yFactorial = 1;
			for (int j = 1; j <= y; j++)
			{
				yFactorial *= j;
			}

			for (x = 1; x < 10; x++)
			{
				int xFactorial = 1;
				for (int k = 1; k <= x; k++)
				{
					xFactorial *= k;
				}

				if (yFactorial + xFactorial == tenFactorial)
				{
					factorialFound = true;
					break;
				}
			}
			if (factorialFound)
			{
				break;
			}
		}

		if (x == 10 && y == 10)
		{
			x = 0;
			y = 0;
		}
		solve10[0] = x;
		solve10[1] = y;
		return solve10;
	}

	public static void main(String[] args)
	{
		int[] res = solve10();

		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}

