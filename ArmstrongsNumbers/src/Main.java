import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number: ");
   int number = input.nextInt();

   int n = 0;
   int tempNumber = number;
   do{
       tempNumber = tempNumber / 10;
       n++;
   }while(tempNumber != 0);

   tempNumber = number;
   int total = 0;
   int digitPow;
   int digitNumber;

   while(tempNumber != 0){
       digitNumber = tempNumber % 10;
       digitPow = 1;
       for(int i =1; i <= n; i++){
           digitPow *= digitNumber;
       }
       total += digitPow;
       tempNumber = tempNumber / 10;

   }
        if (total == number) {
            System.out.println(number + " number is the Armstrong number.");
        }else{
            System.out.println(number + " number is not an Armstrong number.");

        }

    }
}