class MergeTwoSortedArrays {
    public static void main(String[] args){
        System.out.println("Merge Two Sorted Arrays");
        System.out.println("Enter first array:");
        int[] array1 = ArrayUtility.inputArray();

        System.out.println("Enter second array:");
        int[] array2 = ArrayUtility.inputArray();

        System.out.println("Display Arrays:");
        System.out.print("Array 1: ");
        ArrayUtility.displayArray(array1);

        System.out.print("Array 2: ");
        ArrayUtility.displayArray(array2);

        int[] mergedArray = mergeArrays(array1 , array2);
        System.out.println("Merged Array:");
        ArrayUtility.displayArray(mergedArray);
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int newSize  = arr1.length + arr2.length;
        int[] newArray = new int[newSize];

        // pointers for the arrays
        int i = 0, j = 0, k = 0;
        while(i < arr1.length || j < arr2.length){
            if(j==arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                k++;
                i++;
            }else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }

        return newArray;
    }
}
