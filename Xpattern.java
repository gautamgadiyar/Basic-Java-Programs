class Xpattern
{	static void X ()
	{
		int k=1; int m=5;
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<=5; j++)
			{
				if (i==k)
					System.out.print("*");
				else if (j==m)
					System.out.print("*");
				else 
					System.out.print(" ");
				k=k+1;
			}
			System.out.println();
			k=1; m=m-1;
		}
	}
}