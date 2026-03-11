package in.kgcoding.challenge79;

public class Employee {
    private String name;
    private int age;
    private long salary;

    Employee(String name, int age, long salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    String getEmployeeDetails(){
        return "Employee Details: { name: " + this.name + " , " +
                " age: " + this.age + " , " +
                " salary: " + this.salary+ " , " +
                " }";
    }
}
