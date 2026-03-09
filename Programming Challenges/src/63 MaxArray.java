class MaxArray {
    public static void main(String[] args){
        System.out.println("Welcome to max number search in array");
        int[] array  = ArrayUtility.inputArray();

        int max = Integer.MIN_VALUE;
        // using for each loop
        for(int num: array){
            if(max < num){
                max = num;
            }
        }

        System.out.println("THe maximum number of the given array is: " + max);
    }
}
