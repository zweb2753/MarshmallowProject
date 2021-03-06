//package name
package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
import monster.view.monsterDisplay;
import java.util.List;
import java.util.ArrayList;


public class MonsterController 
{
	private monsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	
	public MonsterController()
	{
		popup = new monsterDisplay();
		monsterList = new ArrayList<MarshmallowMonster>();
	}
	
	public void start()
	{
//		boolean finished = true;
//		int count = 0;
//		while(finished < 100)
//		{
//			popup.displayText("I am so neat!");
//			count += 1;
//		}
		
//		for(int loop =0; loop < 15; loop += 1)
//		{
//			popup.displayText(" i am loping " + (loop + 1) + " times out of 15");
//		}
	    
		//makes a new marshmallow monster
		MarshmallowMonster sample = new MarshmallowMonster();
		//System.out.println(sample);
		//makes a popup to display text
		popup.displayText(sample.toString());
		MarshmallowMonster realMonster = new MarshmallowMonster("Scary" , 4, 6, 5.0, false);
		
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		//System.out.println("Zane is hungry, so he is going to at a tentacle");
		popup.displayText("Zane is hungry so he's going to eat a tentacle");
		realMonster.setTentacleAmount(4.0);
		//System.out.println(realMonster);
		popup.displayText(realMonster.toString());
		
		monsterList.add(realMonster);
		monsterList.add(sample);
		testList();
		
		interactWithTheMonster(realMonster);
	}
	
	private void testList()
	{
	// i got tons of errors i dont know how to fix
		for(int index = 0; index < monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getName());
			String newName = popup.getResponse("what shold my name be?");
			currentMonster.setName(newName);
			popup.displayText(currentMonster.getName());
		}
		
		for(MarshmallowMonster current : monsterList)
		{
			popup.displayText(current.getName());
			String newName = popup.getResponse("what should my new name be?");
			current.setName(newName);
			popup.displayText(current.getName());
		}
	}
	
	private void interactWithTheMonster(MarshmallowMonster currentMonster)
	{
		//System.out.println(currentMonster.getName() + " wants to know what to eat next");
		popup.displayText(currentMonster.getName() + " wants to know what toeat next");
		//System.out.println(currentMonster.getName() + " suggests arms, they have " + currentMonster.getArmCount());
		popup.displayText(currentMonster.getName() + "suggests arms, they have " + currentMonster.getArmCount());
		Scanner myScanner = new Scanner(System.in);
		//System.out.println("How many do you want to eat?");
		int specialAnswer = 0;
		String unconverted = popup.getResponse("How many do you want to eat?");
		
		while(isValidInteger(unconverted));
		{
			specialAnswer = Integer.parseInt(unconverted);
		}
		specialAnswer = Integer.parseInt(unconverted);   
		
				unconverted = popup.getResponse("Howmany eyes????");
		
		specialAnswer = Integer.parseInt(unconverted);
		int consumed = 0;
		consumed = specialAnswer;
		if (consumed < 1)
		{
			//System.out.println("you can't eat a negative amount");
			popup.displayText("You cant at a negative amount");
			unconverted = popup.getResponse("you cant eat a negative amount");
		}
		if (consumed == 0)
		{
			//System.out.println("Not that hungry are you");
			unconverted = popup.getResponse("Not that hungry are you?");
		}
		if (consumed > currentMonster.getArmCount())
		{
			//System.out.println("that is impossible i only have " + currentMonster.getArmCount() + " arms!!");
			unconverted = popup.getResponse("That is impossible i only have " + currentMonster.getArmCount() + " arms!!");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
			//System.out.println("thanks i only have this many arms left" + currentMonster.getArmCount());
			popup.displayText("thanks i only have this many arms now" + currentMonster.getArmCount());
		}
		
		//System.out.println(currentMonster.getName() + " suggests eyes, they have " + currentMonster.getEyeCount());
		unconverted = popup.getResponse(currentMonster.getName() + " suggests eyes, theu have " + currentMonster.getEyeCount());
		
		while(!isValidInteger(unconverted))
		{
			unconverted = popup.getResponse("type in a number");
		}
		consumed = Integer.parseInt(unconverted);
		if (consumed > 4)
		{
			//System.out.println("I only have 4 eyes");
			unconverted = popup.getResponse("I only have 4 eyes");
		}
		if (consumed == 0)
		{
			//System.out.println("Guess you don't want my eyes");
			unconverted = popup.getResponse("guess you dont want eyes");
		}
		else 
		{
			//gets the current monster and subtracts the consumed
			currentMonster.setEyeCount(currentMonster.getEyeCount()- consumed);
			//prints out the message and then gets the eye count and displays it
			System.out.println("Now i only have" + currentMonster.getEyeCount());
			//displays the message
			popup.displayText("Hey look at me!!!");
			String answer = popup.getResponse("how many meals are you eating today");
			System.out.println(answer);
			popup.displayText(answer);
	      	
		}
	}
			//helper methods
			private boolean isValidInteger(String sample)
			{
				boolean valid = false;
				
				try
				{
					Integer.parseInt(sample);
					valid = true;
				}
				//catches format error
			catch (NumberFormatException error)
				{
				popup.displayText("Only int values are valid");
				}
				
			return valid;
		}
		
		private boolean isValidDouble(String sampleDouble)
		{
			boolean valid = false;
			
			try
			{
				Double.parseDouble(sampleDouble);
				valid = true;
			}
			//catches format error
			catch (NumberFormatException error)
			{
				//displays the message
				popup.displayText("Only double values are valid: " +sampleDouble + " is not.");
			}
	      
			return valid;
		}
		
		private boolean isValidBoolean(String sampleBoolean)
		{
			boolean valid = false;
			
			try
			{
				Boolean.parseBoolean(sampleBoolean);
				valid = true;
			}
			//catches format errors
			catch(NumberFormatException error)
			{
				//displays the message
				popup.displayText("Only boolean values are allowed");
			}
			
			return valid;
		}
	}
