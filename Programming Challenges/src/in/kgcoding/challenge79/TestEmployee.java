package in.kgcoding.challenge79;

public class TestEmployee {
    public static void main() {
        Employee emp = new Employee("Nitesh", 25,25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Susan");
        System.out.println(emp.getEmployeeDetails());
    }
}
