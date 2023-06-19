import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
        double size = scan.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz: ");
        double kilo = scan.nextDouble();

        double index = kilo / (size * size);

        System.out.println("Vücut Kitle İndeksiniz: " + index);

        if (index <= 18.5) {
            System.out.println("Zayıf");
        } else if ( index <= 24.9) {
            System.out.println("İdeal");

        } else if ( index <= 29.9) {
            System.out.println("Şişman");
        } else if (index <= 34.9) {
            System.out.println("Obez");
        } else  {
            System.out.println("Aşırı Obez");
        }
    }
}
