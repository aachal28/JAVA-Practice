class factorial 
{ 	int fact (int n)
	{ 	
		int result;
		if (n==1)
		{return 1;}
		else
	{
		result=fact(n-1)*n;
		return result;
	}
	}
}
		class recursion
	{
		public static void main ( String args[])
	{ 
		factorial f=new factorial();
		System.out.println("factorial of no 5 is:"+f.fact(5));
	}
	}
