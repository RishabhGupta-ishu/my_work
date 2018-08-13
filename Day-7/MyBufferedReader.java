import java.io.*;

class MyBufferedReader
{
	public static void main(String aa[])throws IOException
	{
	FileReader fr=new FileReader("abc.txt");
	BufferedReader br=new BufferedReader(fr);	

	String s="";
		while(true)
		{
		s=br.readLine();
		if(s==null)break;
		System.out.println(s);
		}
	br.close();
	fr.close();
}
}
