package animalKingdom;

public class Mammals extends Animals
{
	public Mammals(String name, int year)
	{
		super(name, year);
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breathe()
	{
		return "lungs";
	}

	@Override
	public String reproduce()
	{
		return "live births";
	}

	@Override
	public String toString()
 	{
        return "Mammals{" +
                // "food='" + food + '\'' +
                ", name=" + name + '\'' +
                ", year=" + year + 
                '}';
    }
}
