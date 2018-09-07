
public class PettingZoo {
	
	public static void main(String args[]) {

		Sheep timmy = new Sheep();
		timmy.setName("Timmy");
		timmy.setSound("Baaaaaaa");
		timmy.speak();


		Sheep harold = new Sheep();
		harold.setName("Harold");
		//harold.setSound();


		Sheep gretta = new Sheep();
		gretta.setName("Gretta");
	

		Sheep oscar = new Sheep();
		oscar.setName("Oscar");


		Sheep simone = new Sheep();
		simone.setName("Simone");



	}
}

class Sheep {

	private String name;

	private String sound;


	public Sheep() {}
 
	public Sheep(String name) {
		this.name = name;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return this.sound; 
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void speak() {
		System.out.println(sound + "! My name is: " + name);
	}
}