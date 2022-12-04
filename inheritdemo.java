class parent
{
	int x=10;
	void show()
	{
		System.out.println("inside parent-show()");
	}
}
		class child extends parent 
		{
			int y=20;
			int x=100;
			void disp()
	{
		System.out.println("inside child.disp()");
	}
	void show()
		{
			System.out.println("inside child-show()");
		}
		}
public class inheritdemo
{
	public static void main (String args[])
	{
		child c=new child();
		System.out.println(c.x);
		c.disp();
		c.show();
	}
}
