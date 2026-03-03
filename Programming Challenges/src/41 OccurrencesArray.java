import java.util.Scanner;

class OccurrencesArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Find the number of occurrence of an element in an array");
        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Enter the number you want to find the occurrence number: ");
        int number = input.nextInt();

        int numOfOccurrence = numOfOccurrence(numArray,number);
        System.out.println("The number of occurrence for " + number + " in the array is: " + numOfOccurrence);

    }

    public static int numOfOccurrence(int[] array, int num){
        int occurrence = 0;
        int i = 0;
        while(i < array.length){
            if(array[i] == num){
                occurrence++;
            }
            i++;
        }
        return occurrence;
    }
}
