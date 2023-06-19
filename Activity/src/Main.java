import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Degree: ");
        int heat = scan.nextInt();
        String event = "";
        if (heat < 5) {
            event = "Ski";
        } else if (heat < 15) {
            event = "Theatre";
        } else if (heat < 25) {
            event = "Barbecue";
        } else {
            event = "Swimming";
        }
        System.out.println("Recommended activity: " + event);
    }
}