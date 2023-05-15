public class F
{
	public static int f(int[] a)
	{
		int X = 0;
		int Y = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
			{
				Y += a[i];
			}
			else
			{
				X += a[i];
			}
		}

		return X - Y;
	}

	public static void main(String[] args)
	{
		int[] a = {};
		int res = f(a);

		System.out.println(res);
	}
}
