class ReverseArray {
    public static void main(String[] args){
        System.out.println("Reverse an Array:");
        int[] array = ArrayUtility.inputArray();

        System.out.println("The Array:");
        displayArray(array);

        int[] reverseArray = reverseArray(array);

        System.out.println("Display Reversed Array:");
        displayArray(reverseArray);

    }

    public static void displayArray(int[] array){
        int i = 0;
        while(i < array.length){
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array){
//        int i = 0 , j = oldArray.length-1;
//        int [] newArray = new int[oldArray.length];
//        while (i < oldArray.length){
//            newArray[j] = oldArray[i];
//            i++;
//            j--;
//        }
//        return newArray;


        //optimize method using swapping: need half iteration than above code
        int i = 0;
        int swap;
        while( i < array.length/2){
            swap = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = swap;
            i++;
        }
        return array;
    }
}
