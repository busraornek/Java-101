import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int n = input.nextInt();

        System.out.print("Enter the number of bases: ");s
        int k = input.nextInt();
        int result = 1;

        int i = 1;
        while(i <= k){
            result = result * n;
            i ++;
        }
        System.out.println("Conclusion: " + result);
    }
}