import java.io.*;
class alpha_order
{
	static void alp()throws IOException
	{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		System.out.println("ENTER A WORD HERE");
		String a=br.readLine();
		int b=a.length();
		String s="";
		for (int i=65; i<=90; i++)
		{
			for (int j=0; j<b; j++)
			{
				char c=a.charAt(j);
				int d=(int)(c);
				if (d==i)
				{s=s+c;}
			}
		}
		System.out.println("THE WORD IN THE ALPHABETICAL ORDER IS "+s);
	}
}