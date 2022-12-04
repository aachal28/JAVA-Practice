class simpleclass
{
		static int x=100;
		int y=10;
		static void display()
	{
		int z=5;
		System.out.println("x=" +x);
		x++;
	}
}
class statcall
{
	public static void main(String  arg[])
	{
		simpleclass sm=new simpleclass();
		sm.display();
		System.out.println("x=" +sm.x);
		sm.x++;
		System.out.println("x=" +sm.x);
	}
}
