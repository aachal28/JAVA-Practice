class test 
{
		int a;
		test (int i)
	{
		a=i;
	}
	test incr()
	{
		test temp = new test (a=10);
		return temp;
	}
}

class returnbyob{
	public static void main ( String args[])
	test ob=new test (15);
	test ob1;
	System.out.println("before call"+ob.a);
	ob1=ob.incr();
	System.out.println("after call"+ob1.a);
	}
