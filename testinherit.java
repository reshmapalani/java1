class animal
{
	private boolean vegetarian;
	private String eats;
	private int noOfLegs;
	public animal()
	{
	}
	public animal(boolean veg,String food,int legs)
	{
		this.vegetarian=veg;
		this.eats=food;
		this. noOfLegs=legs;
	}
	public boolean isvegetarian()
	{
		return vegetarian;
	}
	public String geteats()
	{
		return eats;
	}
	public int noOfLegs()
	{
		return noOfLegs;
	}
}
class monkey extends animal
{
	private String color;
	public monkey(boolean veg,String food,int legs,String color)
	{
		super(veg,food,legs);
		this.color=color;
	}
	public String getcolor()
	{
		return color;
	}
}
public class testinherit
{
	public static void main(String args[])
	{
		monkey m=new monkey(false,"banana",2,"black");
		System.out.println("monkey is vegetarian "+m.isvegetarian());
		System.out.println("monkey eats "+m.geteats());
		System.out.println("monkey has "+m.noOfLegs()+" legs");
		System.out.println("monkey color is "+m.getcolor());
	}
}





