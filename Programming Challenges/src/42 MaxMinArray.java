class MaxMinArray {
    public static void main(String[] args){
        System.out.println("Maximum and Minimum within the array.");
        int[] numArray = ArrayUtility.inputArray();

        int max = max(numArray);
        int min = min(numArray);

        System.out.println("The maximum element of the array is " + max);
        System.out.println("The minimum element of the array is " + min);

    }

    public static int min(int[] array){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < array.length){
            if(min > array[i]){
                min = array[i];
            }
            i++;
        }
        return min;
    }

    public static int max(int[] array){
        if(array.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = array[0];
        int i = 1;
        while (i < array.length){
            if(max < array[i]){
                max = array[i];
            }
            i++;
        }
        return max;
    }
}
