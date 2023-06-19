import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Java'da girilen sayıya kadar N kuvveti bulan program
 */
       Scanner input = new Scanner(System.in);

       System.out.print("Enter the N value:");
       int n = input.nextInt();

        System.out.print("Enter the K value:");
        int k = input.nextInt();

        for(int i = 1; i <= k; i *= n){
            System.out.println(i);
        }
    }
}
