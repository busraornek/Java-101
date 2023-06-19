import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int physics,mathematics,turkish,chemistry,music,history;
        double conclusion;
        System.out.print("Physics note: ");
        physics = input.nextInt();

        System.out.print("Mathematics note: ");
        mathematics = input.nextInt();

        System.out.print("Turkish note: ");
        turkish = input.nextInt();

        System.out.print("Chemistry note: ");
        chemistry = input.nextInt();

        System.out.print("Music note: ");
        music = input.nextInt();

        System.out.print("History note: ");
        history = input.nextInt();

        conclusion = (physics + mathematics + turkish + chemistry + music + history)/ 6.0 ;

        System.out.print("Your average: " + conclusion);
        System.out.println("Letter equivalent:");

        switch ((int)conclusion / 10) {
            case 10:
            case 9:
                System.out.print("AA");
                break;
            case 8:
                System.out.print("BA");
                break;
            case 7:
                System.out.print("BB");
                break;
            case 6:
                System.out.print("CB");
                break;
            case 5:
                System.out.print("CC");
                break;
            default:
                System.out.print("FF");
                break;
        }

        }
    }
