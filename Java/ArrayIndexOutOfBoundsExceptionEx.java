public class ArrayIndexOutOfBoundsExceptionEx
{
	public static void main(String args[])
	{
		try
		{
			String s1[]=new String[5];
			System.out.println(s1[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Array Index Out of Bounds...");
		}
	}
}
