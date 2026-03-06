import java.util.Scanner;

class StudentScoreTernary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student score: ");
        int studentScore = input.nextInt();

        String result = studentScore > 80 ? "High" : studentScore > 50? "Moderate": "Low";
        System.out.println("The student score falls under category: "+ result);
    }
}
