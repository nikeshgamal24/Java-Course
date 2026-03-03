import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Delete From Array");
        int[] numArray = ArrayUtility.inputArray();

        System.out.print("Enter the number you want to find and delete: ");
        int numToDelete = input.nextInt();

        int numOfOccurrence = numOfOccurrence(numArray,numToDelete);
        System.out.println("The number of occurrence for " + numToDelete + " in the array is: " + numOfOccurrence);

        //delete the number and return new array
        int[] newArray = deleteNumber(numArray,numOfOccurrence,numToDelete);

        System.out.println("Print Old Array");
        printArray(numArray);

        System.out.println("Print Updated New Array");
        printArray(newArray);
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

    public static int[] deleteNumber(int[] oldArray, int occurrence,int numToDelete){
        int newSize = oldArray.length - occurrence;
        int[] array = new int[newSize];
        int i = 0;
        int j = 0;
        while(i < oldArray.length){
            if(oldArray[i] != numToDelete){
                array[j] = oldArray[i];
                j++;
            }
            i++;
        }
        return array;
    }

    public static void printArray(int[] array){
        System.out.println("The Array elements are:");
        int i = 0;
        while(i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }
}
