import java.util.Scanner;

class Student {
    public String name;
    public int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student Details: {name: " + name + ", age: " + age +  "}";
    }

    public static void main(String[] args){
        Student s1 = new Student("Nikesh", 25);
        Student s2 = new Student("Sujan", 28);

        System.out.println("Print toString():");
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
