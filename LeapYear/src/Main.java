import java.util.Scanner;
//Artık yıl hesaplama
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = input.nextInt();

        if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0)){
            System.out.println(year + " is a leap year.2024");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}