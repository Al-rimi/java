package inheritance.q2;

public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, String dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + super.toString();
    }
}
