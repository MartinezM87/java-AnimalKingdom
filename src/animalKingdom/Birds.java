package animalKingdom;

public class Birds extends Animals
{
	public Birds(String name, int year)
	{
		super(name, year);
	}


	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breathe()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
 	{
        return "Birds{" +
                // "food='" + food + '\'' +
                ", name=" + name + '\'' +
                ", year=" + year + 
                '}';
    }
}