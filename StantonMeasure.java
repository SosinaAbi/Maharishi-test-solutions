public class StantonMeasure
{
	public static int stantonMeasure(int[] a)
	{
		int count1 = 0;
		int stantonMeasure = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == 1)
			{
				count1++;
			}
		}

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == count1)
			{
				stantonMeasure++;
			}
		}

		return stantonMeasure;
	}

	public static void main(String[] args)
	{
		int[] a = {};
		int res = stantonMeasure(a);

		System.out.println(res);
	}
}
