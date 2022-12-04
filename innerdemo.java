class outer
{
	static int x=100;
	void test()
	{
		System.out.println("x:" +x);
		x++;
	}
	static class inner
	{
		void show()
		{
		System.out.println("inside show():" +x);
		}
	}
}
public class innerdemo
{
	public static void main (String args[])
	{
		outer ot=new outer();
		ot.test();
		System.out.println("x;" +ot.x);
		outer.inner in=new outer.inner();
		in.show();
	}
}
	
