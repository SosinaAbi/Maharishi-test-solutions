public class IsSquare
{
	public static int isSquare(int n)
	{
		for (int i = 0; i <= n; i++)
		{
			if (i * i == n)
			{
				return 1;
			}
		}

		return 0;
	}

	public static void main(String[] args)
	{
		System.out.println(isSquare(-4));
	}
}
