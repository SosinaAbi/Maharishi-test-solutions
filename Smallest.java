public class Smallest
{
	public static int smallest(int n)
	{
		int numberOfMultiple = 0;
		int nMultiple = 1;
		int number = n;
		boolean checkTwo = false;

		while (true)
		{
			n = number * nMultiple;

			while (n != 0)
			{
				if (n % 10 == 2)
				{
					numberOfMultiple++;
					checkTwo = true;
					break;
				}
				else
				{
					checkTwo = false;
					n /= 10;
				}
			}
			if (checkTwo == true)
			{
				nMultiple++;
			}
			else
			{
				break;
			}
		}

		return numberOfMultiple;
	}

	public static void main(String[] args)
	{
		System.out.println(smallest(124));
	}
}
