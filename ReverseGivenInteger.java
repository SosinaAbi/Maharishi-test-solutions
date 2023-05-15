public class ReverseGivenInteger
{
	public static int reverseGivenInteger(int n)
	{
		int sign = 1;
		int output = 0;

		if (n == 0)
		{
			return 0;
		}

		if (n < 0)
		{
			sign = -1;
		}

		while (n != 0)
		{
			output = (output * 10) + (n % 10);
			n = n / 10;
		}
		return sign * output;
	}

	public static void main(String[] args)
	{
		int a = 1234;
		int res = reverseGivenInteger(a);

		System.out.println(res);
	}
}
