public class IsTrivalent
{
	public static int isTrivalent(int[] a)
	{
		int elementOne = a[0];
		int elementTwo = 0;
		int elementThree = 0;
		int counterOne = 1;
		int counterTwo = 0;
		int counterThree = 0;

		for (int i = 1; i < a.length; i++)
		{
			if (tester != a[i])
			{
				count++;// Do it again!
			}
		}

		if (count != 3)
		{
			return 0;
		}
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 0, -3, 1, -3, 0, 0, -3};
		int res = isTrivalent(a);

		System.out.println(res);
	}
}
