interface A
{
	public void methodA();
	
}
interface B extends A
{
	public void methodB();
}
interface C extends A
{
	public void methodC();
}
class D implements B,C
{
	public void methodA()
	{
		System.out.println("A messaged");
	}
	public void methodB()
	{
		System.out.println("B messaged");
	}
	public void methodC()
	{
		System.out.println("C messaged");
	}
	public static void main(String args[])
	{
		D ob1=new D();
		ob1.methodA();
		ob1.methodB();
		ob1.methodC();
	}
}
