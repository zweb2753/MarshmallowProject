package monster.model;

public class MarshmallowMonster 
{
	//declaration section for data members
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	public MarshmallowMonster()
	{
		//Unless we specify values all data members
		//are a zero, false, or null
	}
	
	public MarshmallowMonster(String name, int eyeCount, int arms, double tentaleCount, boolean hasBoop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = arms;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
	public String toString()
	{
		String description = "Hi, I am a scary monster! My name is " + name + " and I have " + eyeCount;
		description += " eyes and i have " + armCount + " arms, and i have " + tentacleAmount + " tentacles";
		description += " and my bloop existence is " + hasBloop;
		return description;
	}
}
