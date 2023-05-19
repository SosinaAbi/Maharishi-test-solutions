public class Fun5
{
	public static int[] fun5(int[] array, int lengthArray, int k)
	{
		if (array == null || lengthArray < 1 || k <= 0 || lengthArray >= array.length || k >= lengthArray || k >= array.length)
			return null;
		int[] returnArray = new int[lengthArray];

		for (int i = 0, j = 0; j < lengthArray; i++, j++)
		{
			if (i == k)
				i = 0;
			returnArray[j] = array[i];
		}

		return returnArray;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] res = fun5(a, 6, 6);

		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}
