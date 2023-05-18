public class EncodeNumber
{
	public static int[] encodeNumber(int n)
	{
		if (n <= 1)
		{
			return null;
		}

		int arrayLength = 1;
		int factor = 2;
		int number = n;

		while (factor < n)
		{
			if (n % factor == 0)
			{
				arrayLength++;
				n /= factor;
			}
			else
			{
				factor++;
			}
		}
		n = number;
		factor = 2;
		int index = 0;
		int[] returnArray = new int[arrayLength];

		while (factor < n)
		{
			if (n % factor == 0)
			{
				returnArray[index] = factor;
				n /= factor;
				index++;
			}
			else
			{
				factor++;
			}
		}
		returnArray[index] = n;
		return returnArray;
	}
	public static void main(String[] args)
	{
		int[] res = encodeNumber(1);
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}
