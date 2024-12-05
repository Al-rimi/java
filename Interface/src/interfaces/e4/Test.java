package interfaces.e4;

public class Test {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        simulator.playSound(dog);
        simulator.playSound(cat);
        simulator.playSound(cow);
    }
}

