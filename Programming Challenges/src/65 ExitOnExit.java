import java.util.Scanner;

class ExitOnExit {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String word;
        while(true){
            System.out.print("Enter any work you like: ");
            word = input.next();
            if(word.equals("exit")){
                break;
            }
        }
    }
}
