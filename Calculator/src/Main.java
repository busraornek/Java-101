import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. number: ");
        int a = input.nextInt();
        System.out.println("2. number: ");
        int b = input.nextInt();
        System.out.print("1-Collection,  ");
        System.out.print("2-Extraction,  ");
        System.out.print("3-Multiplication,  ");
        System.out.print("4-Division ");
        System.out.println();
        System.out.println("Your action: ");
        int select = input.nextInt();
        double conclusion = 0.0;
        if(select == 1 ){
            conclusion  = a + b;

        }else if(select == 2){
            conclusion = a - b;
        }else if (select == 3){
            conclusion = a * b ;
        } else if(select == 4){
            if(b == 0){
                System.out.println("The divisor cannot be zero.");
            }else{
                conclusion = a / (double)b;
            }
        }else {
            System.out.println("Please enter a valid transaction: ");
        }
       System.out.println("Conclusion: " + conclusion);
    }
}