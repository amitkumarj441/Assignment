import java.io.*;
class BuzzNumber
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int a;
	public void show() throws Exception
	{
		System.out.print("Enter the number");
		a=Integer.parseInt(br.readLine());
		if(a%10==7||a%7==0)
			System.out.println("Entered number is a buzz number");
		else
			System.out.println("Entered number is not a buzz number");
	}
	public static void main(String[] args) throws Exception
	{
		BuzzNumber bn=new BuzzNumber();
		bn.show();
	}
}

