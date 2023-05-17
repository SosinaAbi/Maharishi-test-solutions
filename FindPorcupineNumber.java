public class FindPorcupineNumber
{
	public static int findPorcupineNumber(int n)
	{
		int porcupineNumber = 0;
		int maxValue = Integer.MAX_VALUE;
		boolean isPorcupineNumber = false;
		n++;

		while(n <= maxValue)
		{
			if(isPorcupineNumber)
			{
				if(isPrime(n) == 1)
				{
					if (n % 10 == 9)
					{
						break;
					}
					else
					{
						isPorcupineNumber = false;
					}
				}
			}
			else
			{
				if (isPrime(n) == 1)
				{
					if (n % 10 == 9)
					{
						isPorcupineNumber = true;
						porcupineNumber = n;
					}
				}
			}
			n++;
		}

		return porcupineNumber;
	}

	public static int isPrime(int n)
	{
		if (n > 1)
		{
			for (int i = 2; i < n; i++)
			{
				if (n % i == 0 && n != i)
				{
					return 0;
				}
			}
		}
		else
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		System.out.println(findPorcupineNumber(138));
	}
}
