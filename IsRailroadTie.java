public class IsRailroadTie
{
	public static int isRailroadTie(int[] a)
	{
		if (a.length <= 1 || a[0] == 0 || a == null)
		{
			return 0;
		}

		int zeroIndex = 2;
		for (int i = 1; i < a.length; i++)
		{
			if (i != zeroIndex && a[i] == 0)
			{
				return 0;
			}
			else if (i == zeroIndex)
			{
			       	if (a[i] != 0 || a[i - 1] == 0 || a[i + 1] == 0)
				{
					return 0;
				}
				zeroIndex += 3;

			}
		}
		return 1;
	}
	public static void main(String[] args)
	{
		int[] a = {2};
		int result = isRailroadTie(a);
		System.out.println(result);
	}
}


