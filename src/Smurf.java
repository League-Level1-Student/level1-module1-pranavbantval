import sun.applet.Main;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(name.equalsIgnoreCase("Papa")) {
		return name +" has a red hat";
		}
		else {
			return name + " has a white hat";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if(name.equalsIgnoreCase("Smurfette")) {
			return name + " is a girl";
		}
		else {
		return name + " is a Boy";
		}
	}
	public static void main(String[] args) {
		
	
Smurf handySmurf = new Smurf("Handy");
System.out.println(handySmurf.getName());
handySmurf.eat();
System.out.println(handySmurf.isGirlOrBoy());
System.out.println(handySmurf.getHatColor());
Smurf papa = new Smurf("Papa");
System.out.println(papa.getHatColor());
System.out.println(papa.isGirlOrBoy());
Smurf girl = new Smurf("Smurfette");
System.out.println(girl.getHatColor());
System.out.println(girl.isGirlOrBoy());
}


}
