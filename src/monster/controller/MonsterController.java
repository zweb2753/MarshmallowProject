package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.monsterDisplay;

public class MonsterController 
{
	private monsterDisplay popup;
	
	public MonsterController()
	{
		popup = new monsterDisplay();
	}
	
	public void start()
	{
		MarshmallowMonster sample = new MarshmallowMonster();
		System.out.println(sample);
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary" , 4, 6, 5.0, false);
		
		System.out.println(realMonster);
		System.out.println("Zane is huungry, so he is going to at a tentacle");
		realMonster.setTentacleAmount(4.0);
		System.out.println(realMonster);
		
		interactWithTheMonster(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		System.out.println(currentMonster.getName() + " wants to know what to eat next");
		System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		Scanner myScanner = new Scanner(System.in);
		System.out.println("How many do you want to eat?");
		int consumed = myScanner.nextInt();
		
		if (consumed < 1)
		{
			System.out.println("you cant eat a negtive amount");
		}
		else if (consumed == 0)
		{
			System.out.println("Not that hungry are you");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			System.out.println("that is impossible i only have " + currentMonster.getArmCount() + " arms!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			System.out.println("thanks i only have this many arms left" + currentMonster.getArmCount());
		}
		
		System.out.println(currentMonster.getName() + " suggests eyes, they have " + currentMonster.getEyeCount());
		
		if (consumed < 4)
		{
			System.out.println("I only have 4 eyes");
		}
		else if (consumed == 0)
		{
			System.out.println("Guess you dont want my eyes");
		}
		else 
		{
			currentMonster.setEyeCount(- consumed);
			System.out.println("Now i only have" + currentMonster.getEyeCount());
			
			popup.displayText("Hey look at me!!!");
			String answer = popup.getResponse("how many meals are you eating today");
			System.out.println(answer);
			popup.displayText(answer);
			
		}
	}
}
