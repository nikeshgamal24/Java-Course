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

    public static void displayArray(int [] array){
       int i = 0;
       while(i < array.length){
           System.out.print(array[i] + " ");
           i++;
       }
        System.out.println();
    }
}
