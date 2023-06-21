import java.util.Scanner;
// Negatif sayı girilene kadar dödngü devam ediyor. Negatif sayı girildikten sonra yzılan sayılarda çift sayıları topluyor
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number ;
        int total= 0;

        do{
            System.out.print("Enter number:");
            number = input.nextInt();
            if(number % 2 == 1 ){
                total +=  number;
            }
        }
       while(number > 0);
        System.out.print("Total: " + total);
    }
}