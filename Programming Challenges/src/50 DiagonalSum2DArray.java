class DiagonalSum2DArray {
    public static void main(String[] args){
        System.out.println("Sum of Diagonal Elements of a 2D array");

        System.out.println("Enter 2D array");
        int[][] numArray = ArrayUtility.input2DArray();

        long sum = sumOfDiagonal(numArray);
        System.out.println("The sum of the main diagonal is: " + sum);
    }

    public static long sumOfDiagonal(int[][] array){
        long sum = 0;
        int i = 0, j;
        while(i < array.length) {
            j = 0;
            while (j < array[i].length) {
                if (i == j || (i + j) == (array.length - 1)) {
                    sum += array[i][j];
                    System.out.println(sum);
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
