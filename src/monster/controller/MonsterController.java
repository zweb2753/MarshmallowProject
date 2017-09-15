package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class MonsterController 
{
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
		Scanner myScanneer = new Scanner(System.in);
		System.out.println("How many do you want to eat?");
		int consumed = myScanner.nextInt();
		currentMonster.setArmCount(currentMonster.getArmCount() - consumed);
		System.out.println("ok, now " + currentMonster.getName() + " has " + currentMonster.getArmCount() +  " arms left.");
		
	}
}
