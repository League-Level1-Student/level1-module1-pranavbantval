
public class Taco {
private String meat;
private String sauce;
 String getMeat(){
	return meat;
}
 String getSauce() {
	 return sauce;
 }
void setMeat(String meat){
	this.meat = meat;	 
 }
 void setSauce(String sauce){
	this.sauce = sauce;
 }
	public static void main(String[] args) {
		Person bob = new Person();
	Person sam = new Person();
	Person will = new Person();
	bob.getName();
	bob.setName("Bob");
	sam.getName();
	sam.setName("Sam");
	will.getName();
	will.setName("Will");
	bob.getSuperpower();
	bob.setSuperpower("flying");
	sam.getSuperpower();
	sam.setSuperpower("teleporting");
	will.getSuperpower();
	will.setSuperpower("invisibility");
System.out.println(bob.toString());	
System.out.println(sam.toString());	
System.out.println(will.toString());	
}
 
}
class Person {
	private String name;
	private String superpower;
	 String getName(){
			return name;
		}
		 String getSuperpower() {
			 return superpower;
		 }
		void setName(String name){
			this.name = name;	 
		 }
		 void setSuperpower(String superpower){
			this.superpower = superpower;
		 }
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return name + " has mad " + superpower + " skills";
		}
	
}
