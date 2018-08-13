import java.io.*;

class MyBufferedWriter
{
	public static void main(String aa[])throws IOException
	{
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	
	
	//FileWriter fw=new FileWriter("abc.txt");
	//BufferedWriter bw=new BufferedWriter(fw);
	
	PrintWriter pw=new PrintWriter(new FileWriter("nbc.txt"));
	
		String s="";
		while(true)
		{
		s=br.readLine();
		if(s.equals("stop"))break;
		//bw.write(s);
		//bw.write(" ");
		pw.println(s);
		pw.flush();
		}
	
	//bw.close();
	//fw.close();
	br.close();
	}
}



//StringBuffer			StringBuilder
//1.is synchronized		not Synchronized
//2.object cannot be shared	can be shared


