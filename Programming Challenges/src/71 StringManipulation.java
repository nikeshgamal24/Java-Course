import java.util.Scanner;

class StringManipulation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = input.next();

        System.out.println("Enter second string: ");
        String str2 = input.next();

        // concatenate string
        String result = str1.concat(str2).toUpperCase();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(result);

    }
}
