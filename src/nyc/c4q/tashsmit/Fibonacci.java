package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/19/15.
 */
import java.util.Scanner;
public class Fibonacci {



    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        //prompt user input
        System.out.println(">");
        //user inputs number
        double num1 = input.nextDouble();
        //call function using user input and print out result
        System.out.println(fNum(num1));

    }

    public static double fNum(double number) {

        double fibNum = 0;
        double num1 = 0;
        double num2 = 1;
        //if user inputs 0, this should not go through the loop
        if (number == 0)
            return 0;
        else
            for (int i = 0; i < number-2; i++){
                fibNum = num1 + num2;
                num1 = num2; //update num1
                num2 = fibNum;  //update num 2
                //then continue loop
            }
        return fibNum;

    }
}
