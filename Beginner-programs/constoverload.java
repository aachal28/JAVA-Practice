public class constoverload
{
	int id, age, rewardpt;
	String name, contactno;
	constoverload(int age, String contactno, int rewardpt)
	{
		this.age=age;
		this.contactno=contactno;
		this.rewardpt=rewardpt;
	}
	constoverload(int id, String name)
	{
		this(30,"987654321", 45);
		this.id=id;
		this.name=name;
	}
public static void main(String args[])
	{
		constoverload c=new constoverload(101,"aachal");
		System.out.println("Customer information");
		System.out.println("name:"+c.name+"\nid:"+c.id+"\nage"+c.id		+"\ncontactno:"+c.contactno+"\nreward-pt:"+c.rewardpt);
	}
}
