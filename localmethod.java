//local method inner class
class outer
{
	int x=100;
	void test()
	{
		class inner
		{
		void display()
		{
			System.out.println("x=" +x);
			x++;
		}
		}
		inner in=new inner();
		in.display();
	}
}
class localmethod
{
	public static void main(String arg[])
	{
		outer ot=new outer();
		ot.test();
	}

}
		
		
