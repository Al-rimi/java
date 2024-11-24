package inheritance.q2;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Main St", "555-1234", "alice@example.com");
        Student student = new Student("Bob", "456 College Ave", "555-5678", "bob@example.com", Student.FRESHMAN);
        Employee employee = new Employee("Carol", "789 Office Rd", "555-8765", "carol@example.com", "Office 101", 50000, "01/01/2020");
        Faculty faculty = new Faculty("David", "321 Faculty Dr", "555-4321", "david@example.com", "Office 202", 60000, "01/01/2015", "9am-5pm", "Professor");
        Staff staff = new Staff("Eve", "654 Staff Ln", "555-6789", "eve@example.com", "Office 303", 40000, "01/01/2018", "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
