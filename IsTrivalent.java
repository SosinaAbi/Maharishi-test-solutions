public class IsTrivalent
{
	public static int isTrivalent(int[] a)
	{
		if (a == null || a.length <= 2)
		{
			return 0;
		}
		int[] triArray = new int[3];
		triArray[0] = a[0];
		int triIndex = 1;

		for (int i = 1; i < a.length; i++)
		{
			while (true)
			{
				if (triIndex == 1)
				{
					if (triArray[0] != a[i])
					{
						triArray[1] = a[i];
						triIndex++;
						break;
					}
					else
					{
						break;
					}
				}
				else if (triIndex == 2)
				{
					if (triArray[0] != a[i] && triArray[1] != a[i])
					{
						triArray[2] = a[i];
						triIndex++;
						break;
					}
					else
					{
						break;
					}
				}
				else if (triIndex == 3)
				{
					if (triArray[0] != a[i] && triArray[1] != a[i] && triArray[2] != a[i])
					{
						return 0;
					}
					else
					{
						break;
					}
				}
			}
		}
		
		if (triIndex != 3)
		{
			return 0;
		}
		
		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 0, -3, 1, -3, 0, 0};
		int res = isTrivalent(a);

		System.out.println(res);
	}
}
