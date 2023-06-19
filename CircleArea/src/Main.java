import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the radius value of the circle: ");
        int r = scan.nextInt();

        double area = Math.PI * r * r ;
        double environment = 2 * Math.PI * r ;

        System.out.print("Circle area: " + area);
        System.out.println();
        System.out.print("Circle environment: " + environment);
        System.out.println();
        System.out.print("Please enter the central angle: ");

        int a = scan.nextInt();

        double aArea = ((Math.PI * (r * r) * a) /360) ;
        double aEnvironment = (2 *( Math.PI * r * a ) /360 );

        System.out.print("Area of a circle with a central angle of " + a +": " + aArea);
        System.out.println();
        System.out.print("Environment of a circle with a central angle of " + a +": " + aEnvironment);
    }
}