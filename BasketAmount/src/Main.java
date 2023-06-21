import java.util.Scanner;
// alışveriş sepeti tutarı hesaplama
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      double cucumber = 3.14;
      double apple = 4.11;
      double tomato = 0.95;
      double squash = 2.22;
      double eggplant = 7.00;

        System.out.print("How many kilograms of cucumbers: ");
        double cucumberKg = scan.nextDouble();

        System.out.print("How many kilograms of apple: ");
        double appleKg = scan.nextDouble();

        System.out.print("How many kilograms of tomato: ");
        double tomatoKg = scan.nextDouble();

        System.out.print("How many kilograms of squash: ");
        double squashKg = scan.nextDouble();

        System.out.print("How many kilograms of eggplant: ");
        double eggplantKg = scan.nextDouble();

        double total = 0.0;
        total += (cucumber * cucumberKg);
        total += (apple * appleKg);
        total += (tomato * tomatoKg);
        total += (squash * squashKg);
        total += (eggplant * eggplantKg);

        System.out.print("Holds the ball: " + total);

    }
}