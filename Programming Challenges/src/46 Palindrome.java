class Palindrome {
    public static void main(String[] args){
        System.out.println("Palindrome Check:");
        int[] array = ArrayUtility.inputArray();

        System.out.println("The Array:");
        displayArray(array);

        boolean isPalindrome = isPalindrome(array);

       if(isPalindrome){
           System.out.println("The given array is a palindrome");
       }else{
           System.out.println("The given array is not a palindrome");
       }
    }

    public static void displayArray(int[] array){
        int i = 0;
        while(i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static boolean isPalindrome(int[] array){
        //optimize method using swapping: need half iteration than above code
        int i = 0;
        while( i < array.length/2){
            if(array[i] != array[(array.length - 1) - i]){
                return false;
            }
           i++;
        }
        return true;
    }
}
