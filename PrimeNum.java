import java.util.Scanner;

public class PrimeNum{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number:");
        int num = input.nextInt();
        int count =0;

        if(num<=1){
        System.out.println("The number is not a Prime number");
        }else{
        for(int i=2;i<num;i++) {

            if (num % i == 0) {
                count++;
                break;
         }
         }
         }
        if(count==0){
            System.out.println("The number is a Prime number");
        }else{
            System.out.println("The number is not a Prime number");
        }
    }

}
