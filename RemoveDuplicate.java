public class RemoveDuplicate
{
	public static int[] removeDuplicate(int[] a)
	{
		if (a == null || a.length < 1)
		{
			return a;
		}

		int[] temp = new int[a.length];
		int count = 0;

		for (int i = 0; i < a.length; i++)
		{
			boolean check = true;
			for (int j = 0; j < temp.length; j++)
			{
				if (a[i] == temp[j])
				{
					check = false;
					break;
				}
			}
			if (check == true)
			{
				temp[count] = a[i];
				count++;
			}
		}
		
		int[] output = new int[count];

		for (int i = 0; i < output.length; i++)
		{
			output[i] = temp[i];
		}		

		return output;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 2, 3, 1, 4, 5};

		int[] res = removeDuplicate(a);

		for (int i= 0; i < res.length; i++)
		{
			System.out.println(res[i]);
		}
	}
}


