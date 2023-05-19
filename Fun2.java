public class Fun2
{
	public static int fun2(int[] array)
	{
		if (array == null || array.length <= 1)
			return 0;
		if (array.length % 2 == 0)
		{
			for (int i = 0, j = array.length /2; j < array.length; i++, j++)
			{
				if (array[i] != array[j])
					return 0;
			}
		}
		else
		{
			int mid = array.length / 2;
			for (int i = 0, j = mid + 1; j < array.length; i++, j++)
			{
				if (array[i] != array[j] || array[mid] == array[i] || array[mid] == array[j])
					return 0;
			}
		}

		return 1;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 1};
		int res = fun2(a);

		System.out.println(res);
	}
}
