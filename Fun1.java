public class Fun1
{
	public static int func1(int number)
	{
		if (number <= 0)
			return 0;
		else if (number == 1)
			return 1;
		int div = 2;
		while (div <= number)
		{
			if (number % div == 0)
				return number / div;
			else
				div++;
		}
		return 0;
	}
	public static void main(String[] args)
	{
		System.out.println(func1(7));
	}
}
