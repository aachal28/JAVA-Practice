class test
{	
	int a,b;
	test (int i, int j)
	{	 
		a=i;b=j;
	}
		void  meth (test o)
	{	
		o.a*=2;
		o.b/=2;	
	}	
	void meth (int i, int j)
	{
		a=++i;
		b=++j;
	}
}
		class callbyref
{
		public static void main ( String args[])
	{
		test ob=new test (15,20);
		System.out.println("before call 08:"+ob.a+","+ob.b);
		ob.meth(ob);
		System.out.println("after call 08:" +ob.a+","+ob.b);
		ob.meth(30,10);
		System.out.println("after call 08:"+ob.a+","+ob.b);
	}
	
}
