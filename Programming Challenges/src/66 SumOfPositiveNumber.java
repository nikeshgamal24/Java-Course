class SumOfPositiveNumber {
    public static void main(String[] args){
        int[] array = ArrayUtility.inputArray();

        int sum = 0;
        for(int num: array){
            if(num < 0){
                continue;
            }
            sum += num;
        }

        System.out.println("The sum of Postive number is: " + sum);
    }
}
