class abc
	{
		static int i=5;
	}
		class statdemo
	{
		public static void main(String a[])
		{
			abc o1=new abc();
			abc o2=new abc();
			System.out.println("o1:" +o1.i);
			o1.i++;
			System.out.println("o2:" +o2.i);
		}
	}
		
	

