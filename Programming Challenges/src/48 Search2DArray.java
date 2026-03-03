import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D array search:");

        System.out.println("Enter the 2D array");
        int[][] array = ArrayUtility.input2DArray();

        System.out.print("Enter the number you want to search in the array:");
        int num = input.nextInt();

        boolean isFound = isFound(array, num);
        if(isFound){
            System.out.println("Your number was found");
        }else{
            System.out.println("Your number was not found");
        }
    }


    public static boolean isFound(int[][] array, int num){
        int i = 0, j ;
        while(i < array.length){
            j = 0;
            while(j < array[i].length){
                if(array[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
