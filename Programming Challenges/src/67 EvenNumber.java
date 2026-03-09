 class EvenNumber {
     public static void main(String[] args){
         int[] array = ArrayUtility.inputArray();
         System.out.println("The even numbers of the given array is: ");
         for(int num: array){
             if(num % 2 != 0){
                 continue;
             }
             System.out.print(num + " ");
         }
     }
}
