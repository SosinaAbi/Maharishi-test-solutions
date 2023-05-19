public class Fun6
{
	public static int fun6(int[] array)
	{
		if (array == null || array.length < 2)
			return -1;

		int sub = Math.abs(array[0] - array[1]);
		for (int i = 0; i < array.length; i++)
		{
			for (int j = i + 1; j < array.length; j++)
			{
				if (Math.abs(array[i] - array[j]) > sub)
				{
					sub = Math.abs(array[i] - array[j]);
				}
			}
		}

		return sub;
	}

	public static void main(String[] args)
	{
		int[] a = {12, 54, 8, 3, 41};
		System.out.println(fun6(a));
	}
}

