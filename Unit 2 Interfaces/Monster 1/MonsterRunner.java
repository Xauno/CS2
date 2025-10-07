//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for name and size
		System.out.println("How many monsters are you creating?");
		int monsters = keyboard.nextInt();
		Skeleton[] monsterArray = new Skeleton[monsters];

		for (int monsterNum = 0; monsterNum < monsters; monsterNum++){
			System.out.print("What is your monster's name? ");
			String name = keyboard.next();
			System.out.print("What is your monster's size? ");
			int size = keyboard.nextInt();
			monsterArray[monsterNum] = new Skeleton(name, size);
		}

		System.out.println("Monster One " + (monsterArray[0].isBigger(monsterArray[1]) ? "is " : "is not ") + "bigger than Monster Two");
		System.out.println("Monster One " + (monsterArray[0].namesTheSame(monsterArray[1]) ? "has " : "does not have ")+ "the same name as Monster Two");

	}
}