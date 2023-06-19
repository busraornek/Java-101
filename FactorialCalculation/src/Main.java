import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("factorial number: " );
        int n = input.nextInt();
        int result = 1;

        for(int i = 2; i <= n; i++){
            result *= i ;

        }
        System.out.println("Conclusion: " + result);

    }
}