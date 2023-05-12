public class ClusterCompression
{
	public static int[] clusterCompression(int[] a)
	{
		int prevElement = a[0];
		int[] returnArray = new int[a.length];
		int count = 0;

		if (a == null)
		{
			return null;
		}

		for (int i = 1; i < a.length; i++)
		{
			if (prevElement == a[i])
			{
				continue;
			}
			else
			{
				returnArray[count] = prevElement;
				prevElement = a[i];
				count++;
			}
		}
		returnArray[count] = a[prevElement];
		return returnArray;
	}
	
	public static void main(String[] args)
	{
		int[] a = {2, 2, 3, 3, 3, 4, 5, 3, 3, 4, 3};
		int[] result = clusterCompression(a);

		for (int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}

