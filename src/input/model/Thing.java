package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;

	public Thing()
	{
		age = -1;
		weight = -.23;
		name = "";
	}
	
	public Thing(String name, int age, double weight)
	
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	/** Displays all of the variables from the object as a string.
	 * 
	 * @param name
	 * @param age
	 * @param weight
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	/**
	 * Returns a string object describes the thing and data
	 */
	public String toString()
	{
		String thingInfo =  ("name" + name + "age" + age + "weight" + weight);
		return thingInfo;
	}
	
}
