import java.util.Scanner;

class OccurrenceForEach {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the occurrence finding program");
        int[] array = ArrayUtility.inputArray();

        System.out.println("Enter a number of which you want to find the number of occurrence: ");
        int searchNum = input.nextInt();

        int count = 0;
        for(int num: array){
            if(searchNum == num){
                count++;
            }
        }
        System.out.println("The number of occurrence of " + searchNum + " is: " + count);
    }
}
