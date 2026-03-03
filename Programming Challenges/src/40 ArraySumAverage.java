class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Sum and Average of the array");
        int[] numArray = ArrayUtility.inputArray();

        long sum = sum(numArray);
        int average = average(numArray);
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
    }

    public static long sum(int[] array){
        long sum = 0;
        int i = 0;
        while(i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static int average(int[] array){
        long sum = sum(array);
        return (int)sum/array.length;
    }
}
