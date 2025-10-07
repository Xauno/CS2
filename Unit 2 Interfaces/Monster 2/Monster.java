//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Monster implements Comparable<Monster>
{
	private int height, weight, age;
	private String name;

	public Monster(String n, int h, int w, int a){
		name = n;
		height = h;
		weight = w;
		age = a;
	}

	public int getAge() {
		return age;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public int compareTo(Monster other){
		return Integer.signum(this.getHeight - other.getHeight());
	}
}