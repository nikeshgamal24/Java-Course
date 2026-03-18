package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Student{
    private String name;
    private double gpa;

    public Student( String name,double gpa) {
        this.gpa = gpa;
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public String toString() {
        return name + " : " + gpa;
    }
}
public class ComparatorExercise {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ajay", 3.5));
        students.add(new Student("Sneha", 3.2));
        students.add(new Student("Simran", 3.9));

        // Original List
        System.out.println("Original List:");

        // Iterating List
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();

        // Sort students by name, then by age
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);

        // Display message after sorting
        System.out.println("After Sorting:");

        students.sort(comparator); // using custom sorting logic: Comparator to sort the students 

        for (Student s : students) {
            System.out.println(s.getName() + ": " + s.getGpa());
        }
    }
}
