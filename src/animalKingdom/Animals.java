package animalKingdom;


public abstract class Animals
{
	protected int maxId = 0;
	protected int id;
	// public int food;
	protected String name;
	protected int year;

	public Animals(/* int food, */String name, int year)
	{
		maxId++;

		id = maxId;
		this.name = name;
		this.year = year;
		// this.food = food;
	}

	// public Animals() // repeated abstracts require unique params.
	// {
	// 	food = 1;
	// }

	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();

	public String getFood()
	{
		return "food";
	}

	// public void setFood()
	// {
	// 	this.food += 1;
	// }

	// public Integer getId()
	// {
	// 	return id;
	// }

	public String getName()
	{
		return " Name: " + name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getYear()
	{
		return year;
	}

	public void setYear(Integer year)
	{
		this.year = year;
	}

}