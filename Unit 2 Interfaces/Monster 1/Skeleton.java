//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private String name;
	private int size;

	//add a constructor
	Skeleton(String n, int s){
		this.name = n;
		this.size = s;
	}

	//add code to implement the Monster interface
	public int getHowBig(){
		return size;
	}

	public String getName(){
		return name;
	}

	@Override
	public boolean isBigger(Monster other){
		return this.getHowBig() > other.getHowBig();
	}

	@Override
	public boolean isSmaller(Monster other){
		return this.getHowBig() < other.getHowBig();
	}

	@Override
	public boolean namesTheSame(Monster other) {
		return this.getName().equals(other.getName());
	}

	//add a toString
	@Override
	public String toString() {
		return getName() + ": " + getHowBig();
	}
}