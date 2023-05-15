public class FilterCommonArrayElements
{
	public static int[] filterCommonArrayElements(int[] a, int[] b)
	{
		int[] empty = {};

		if (a == null || b == null)
		{
			return null;
		}

		else if (a.length == 0 || b.length == 0)
		{
			return empty;
		}

		int commonElementArraySize = 0;
		if (a.length > b.length)
		{
			commonElementArraySize = b.length;
		}
		else
		{
			commonElementArraySize = a.length;
		}

		int[] commonElements = new int[commonElementArraySize];
		int counter = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++)
			{
				if (a[i] == b[j])
				{
					commonElements[counter] = a[i];
					counter++;
				}
			}
		}

		int[] output = new int[counter];

		for (int i = 0; i < counter; i++)
		{
			output[i] = commonElements[i];
		}
		return output;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 4};
		int[] b = {2, 4, 5};
		int[] res = filterCommonArrayElements(a, b);
		
		for (int i = 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}	

