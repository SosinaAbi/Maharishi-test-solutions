public class IsGuthrieSequence
{
	public static int isGuthrieSequence(int[] a)
	{
		if (a[a.length - 1] != 1)
		{
			return 0;
		}

		int guth = a[0];

		for (int i = 1; i < a.length; i++)
		{
			if (guth % 2 == 0)
			{
				guth /= 2;
			}
			else
			{
				guth *=3 + 1;
			}

			if (guth != a[i])
			{
				return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {8, 4, 2};
		int res = isGuthrieSequence(a);

		System.out.println(res);
	}
}
			
