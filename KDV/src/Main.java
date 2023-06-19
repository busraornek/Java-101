import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price ;
        double rate ;

        System.out.print("Tutarı Giriniz: ");
        price = scan.nextDouble();

        if ( price < 500){
            rate = 18.0;
        }else{
            rate = 8.0;
        }

        double kdvPrice = price * (rate / 100);
        double total = price + kdvPrice;

        System.out.println("KDV Oranı: %" + (int)rate);
        System.out.println("KDV Tutarı: " + kdvPrice);
        System.out.println("KDV'li Tutar: " +total);


    }
}