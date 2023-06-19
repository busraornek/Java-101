
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan  =new  Scanner(System.in);



        System.out.println("Please enter the distance to be traveled by taxi: ");

        double distance = scan.nextDouble();

        double price = (distance * 2.20 ) + 10;
        price = (price <20 ) ? 20: price;

        System.out.print("Amount to be paid: " + price + "TL");





    }
}