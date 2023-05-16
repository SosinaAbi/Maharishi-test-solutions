public class ConvertToBase10
{
	public static int convertToBase10(int[] a, int base)
	{
		int result = 0;
		int j = a.length - 1;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] >= base)
			{
				return 0;
			}
			else
			{
				result += a[i] * Math.pow(base, j);
			}
			j--;

		}

		return result;
	}

	public static void main(String[] args)
	{
		int[] a = {3, 7, 1};
		int res = convertToBase10(a, 6);

		System.out.println(res);
	}
}
