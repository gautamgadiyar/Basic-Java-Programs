import java.io.*;
//checking eligibity if voter
class application
{
	public static void reader()throws IOException
	{
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(x);
		String g="indian";
		System.out.println("WELCOME");
		System.out.println("ENTER UR FULL NAME ");
		System.out.println("ENTER UR RIGHT AGE ");
		String s=br.readLine();
		int a=Integer.parseInt(s);

		if (a>=18)
		{System.out.println("YOU ARE ELIGIBLE TO VOTE");}
		else 
		System.out.println("U R NOT ELIGIBLE");
	}
}
