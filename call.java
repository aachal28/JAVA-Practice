class A
{
	A(){
	System.out.println("inside Aconstructor"); }
}
class B extends A
{
	B(){
	System.out.println("inside b constructor"); }
}
class C extends B
{
	C(){
	System.out.println("inside C Constructor"); }
}
class call
{
	public static void main (String args[])
	{
	C obj =new C ();
	}
}
