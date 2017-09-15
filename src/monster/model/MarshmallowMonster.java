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
	
	public String getName()
	{
		return name;
	}
	
	public int geteyeCount()
	{
		return eyeCount;
	}
	
	public int armCount()
	{
		return armCount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	 
	public boolean hasBloop()
	{
		return hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void setArmCount(int aarmCount)
	{
		this.armCount = armCount;
	}
	
	public void setTentcleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
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
