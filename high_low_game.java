import java.lang.Math;
import java.util.Scanner;
public class high_low_game{
    public static void main(String args[]){
        int min=1;
        int max=100;
        int a=0;
        System.out.println("The number is between"+min + " till "+max);
        int number = (int)(Math.random()*(max-min+1)+min);


        for(int i=1;i>a;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter an integer ");

            int b = input.nextInt();

            if(b>number){
            System.out.println("low");

            }
            if (b<number) {
            System.out.println("high");

            }
            if (b==number) {
            System.out.println("Correct");
            i=a;
            break;
            }
    }
        System.out.println("Good job you got the number right");

    
    }
}