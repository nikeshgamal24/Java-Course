import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an array (n): ");
        int size = input.nextInt();

        int[] nums = new int[size]; //array initialization

        //elements entries
        int i = 0;
        while(i < size){
            System.out.print("Enter the array element no "+ (i+1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }

    public static int[][] input2DArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows of the array: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns of the array: ");
        int columns = input.nextInt();

        int[][] numArray = new int[rows][columns]; //array initialization

        //elements entries
        int i = 0 ;
        int j;
        while(i < rows){
            j = 0;
            while(j < columns){
                System.out.print("Enter the array element on row: "+ (i+1) + " and column: " + (j+1)+ " ");
                numArray[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    public static void displayArray(int [] array){
       int i = 0;
       while(i < array.length){
           System.out.print(array[i] + " ");
           i++;
       }
        System.out.println();
    }
}
