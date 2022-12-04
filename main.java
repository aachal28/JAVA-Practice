class main
{
	public static int isprime (int n)
	{
		for(int i=2;i<=math.sqrt(n);i++)
		{
			if(n.i==0)
			return 0;
		}
		return 1;
	}
	public static void primefactors(int n)
	{
		for (int i=2;i<=n;i++)
		{
			if (isprime(i)==1)
		{
			int x=n;
			while(x%1==0)
		{
			System.out.println(i+"");
			x/=i;
		}
		}
		}
	}
	public static void main(string[] args)
	{
		int n=90;
		primefactors(n);
		}
}
