package interfaces.e4;

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Cow moos: Moo!");
    }
}
