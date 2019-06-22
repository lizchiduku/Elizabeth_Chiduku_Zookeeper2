public class Bat extends Mammal {
    public Bat() {
        energyLevel = 300;
    }
    public void fly1() {
        System.out.println("Boosh, Boosh, Boosh.");
        energyLevel -= 50;
    }
    public void eatHumans() {
        System.out.println("Pop, pop, pop, pop.");
        energyLevel += 25;
    }
    public void attackTown() {
        System.out.println("Bang, Bang, Bang.");
        energyLevel -= 100;
    }
	public void fly() {
		
	}
}