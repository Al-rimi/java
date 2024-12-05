package interfaces.e3;

public class Robert extends Machine implements Walkable, Flyable, Swimmable {
    @Override
    public void operate() {
        System.out.println("Robert operating...");
    }

    @Override
    public void walk() {
        System.out.println("Robert is walking.");
    }

    @Override
    public void fly() {
        System.out.println("Robert is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Robert is swimming.");
    }
}

