public class NUpCount{
	
public static int nUpCount(int[] a, int n)
{
	int nUpCount = 0;
	int prevPartialSum = 0;
	int partialSum = 0;

	for (int i = 0; i < a.length; i++)
	{
		prevPartialSum = partialSum;
		partialSum += a[i];

		if (prevPartialSum <= n && partialSum > n)
		{
			nUpCount++;
		}
	}
	return nUpCount;
}
}
