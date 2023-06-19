import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1. Side: ");
        int a = scan.nextInt();

        System.out.print("2. Side: ");
        int b = scan.nextInt();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.print("Hypotenuse: " + c);

        double u = (a + b+ c);
        System.out.println();
        System.out.print("Perimeter of triangle: " + u);
        System.out.println();
        double area = (a*b)/2;
        System.out.print("Area of triangle: " + area);





    }
}