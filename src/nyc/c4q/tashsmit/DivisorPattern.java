package nyc.c4q.tashsmit;

import java.util.Scanner;

/**
 * Created by tasha.smith on 3/18/2015.
 */
public class DivisorPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide first number: ");
        //TODO write code to allow user to put in two numbers
        //they should be saved as two seperate integers: int x and int y

        //Call the method with integers:
        int num1 = input.nextInt();
        System.out.println("Please provide second number: ");
        int num2 = input.nextInt();

        Divisor(num1,num2);


    }

    public static void Divisor(int num1, int num2) {

        int i = 0;
        String line ="";

        for (i = 1; i <= num2; i++) {

            for (int m = 1; m <= num1; m++) {
                if (m%i==0 || i%m ==0 )
                    line += "@ ";
                else
                    line += "  ";
            }
            System.out.println(line);
            line = "";
        }

    }
}
