public class Fun3
{
	public static int fun3(int[] array)
	{
		if (array == null || array.length < 4)
			return 0;

		int even = array[0];
		int odd = array[1];

		for (int i = 2; i < array.length; i++)
		{
			if (i % 2 == 0 && even < array[i])
				even = array[i];
			else if (i % 2 != 0 && odd > array[i])
				odd = array[i];
			else
				return 0;
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 6, 3, 4, 5, 2};
		System.out.println(fun3(a));
	}
}
