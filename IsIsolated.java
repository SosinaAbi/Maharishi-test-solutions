public class IsIsolated 
{
	public static int isIsolated(long n)
	{
		if (n < 1 || n * n * n > Long.MAX_VALUE)
		{
			return -1;
		}
		
		long square = n * n;
		long cube = n * n * n;
		long tempCube = cube;
		int squareModule = (int)(square % 10);

		while (square != 0)
		{
			int cubeModule = (int)(tempCube % 10);
			while (tempCube != 0)
			{
				if (squareModule == cubeModule)
				{
					return 0;
				}
				tempCube = tempCube / 10;
				cubeModule = (int)(tempCube % 10);
			}
			tempCube = cube;
			square = square / 10;
			squareModule = (int)(square % 10);
		}

		return 1;
	}

	public static void main(String[] args)
	{
		long n = 2;
		int res = isIsolated(n);

		System.out.println(res);
	}
}

