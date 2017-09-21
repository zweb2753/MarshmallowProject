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
		//System.out.println(sample);
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary" , 4, 6, 5.0, false);
		
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		//System.out.println("Zane is hungry, so he is going to at a tentacle");
		popup.displayText("Zane is hungry so he's going to eat a tentacle");
		realMonster.setTentacleAmount(4.0);
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		
		interactWithTheMonster(realMonster);
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		//System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + " wants to know what toeat next");
		//System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + "suggests arms, they have " + currentMonster.getArmCount());
		Scanner myScanner = new Scanner(System.in);
		//System.out.println("How many do you want to eat?");
		int specialAnswer;
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		specialAnswer = Integer.parseInt(unconverted);
		
		
		int consumed = myScanner.nextInt();
		
		if (consumed < 1)
		{
			//System.out.println("you cant eat a negative amount");
			popup.displayText("You cant at a negative amount");
		}
		else if (consumed == 0)
		{
			//System.out.println("Not that hungry are you");
			popup.displayText("Not that hungry are you?");
		}
		else if (consumed > currentMonster.getArmCount())
		{
			//System.out.println("that is impossible i only have " + currentMonster.getArmCount() + " arms!!");
			popup.displayText("That is impossible i only have " + currentMonster.getArmCount() + " arms!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			//System.out.println("thanks i only have this many arms left" + currentMonster.getArmCount());
			popup.displayText("thanks i only have this many arms now" + currentMonster.getArmCount());
		}
		
		//System.out.println(currentMonster.getName() + " suggests eyes, they have " + currentMonster.getEyeCount());
		popup.displayText(currentMonster.getName() + " suggests eyes, theu have " + currentMonster.getEyeCount());
		
		if (consumed < 4)
		{
			//System.out.println("I only have 4 eyes");
			popup.displayText("I only have 4 eyes");
		}
		else if (consumed == 0)
		{
			//System.out.println("Guess you dont want my eyes");
			popup.displayText("guess you dont want eyes");
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
