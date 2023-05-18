public class FrequentlyOccurre
{
	public static int frequentlyOccurre(int[] a)
	{
		if (a == null)
		{
			return 0;
		}
		int firstOccurre = 1;
		int mostOccurre = 0;
		int frequentlyOccurre = a[0];

		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] == a[j])
				{
					firstOccurre++;
				}
			}
			if (firstOccurre > mostOccurre)
			{
				mostOccurre = firstOccurre;
				frequentlyOccurre = a[i];
			}
			firstOccurre = 1;
		}

		return frequentlyOccurre;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 1, 2, 1, 3, 3, 3, 3};
		System.out.println(frequentlyOccurre(a));
	}
}
