class SumAvg2DArray {
    public static void main(String[] args){
        System.out.println("Sum and Average of 2D array");

        System.out.println("Enter the 2D array");
        int[][] numArray = ArrayUtility.input2DArray();

        long sumOfArray = sum2DArray(numArray);
        double avgOfArray = avg2DArray(numArray);

        System.out.println("The sum of the elements of the array is: "  + sumOfArray);
        System.out.println("The average of the elements of the array is: "  + avgOfArray);

    }

    public static long sum2DArray(int[][] arr){
        long sum = 0;
        int i = 0, j;
        while(i < arr.length){
            j = 0;
            while(j < arr[i].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double avg2DArray(int[][] arr){
        if(arr.length == 0 ){
            return 0;
        }
        int rows = arr.length;
        int columns = arr[0].length;

        long sum = sum2DArray(arr);
        return (double)sum/(rows * columns);
    }
}
