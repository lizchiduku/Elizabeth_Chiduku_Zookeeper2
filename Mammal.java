public class Mammal {
    protected int energyLevel;
    public Mammal() {
        energyLevel = 300;
    }
    public Integer displayEnergy() {
        System.out.println(energyLevel);
        return energyLevel;
    }
}