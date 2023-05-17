public class IsMadhavArray
{
	public static int isMadhavArray(int[] a)
	{
		int len = 0;
		boolean checkLen = false;

		for (int i = 1; i < a.length; i++)
		{
			len += i;

			if (len == a.length)
			{
				checkLen = true;
			}
		}
		
		if (checkLen == false)
		{
			return 0;
		}
		else
		{
			int sum = 0;
			int prevSum = a[0];
			int startIndex = 1;
			int endIndex = 2;
			int madhavLen = 1;

			while (endIndex < a.length)
			{
				madhavLen++;
				sum = 0;
				for(int i = startIndex; i <= endIndex; i++)
				{
					sum += a[i];
				}
				
				if (prevSum != sum)
				{
					return 0;
				}
				startIndex = endIndex + 1;
				endIndex = startIndex + madhavLen;
			}
			return 1;
		}
	}
	public static void main(String[] args)
	{
		int[] a = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
		int res = isMadhavArray(a);

		System.out.println(res);
	}
}
