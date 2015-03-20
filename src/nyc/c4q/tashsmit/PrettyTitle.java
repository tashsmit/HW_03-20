package nyc.c4q.tashsmit;

/**
 * Created by c4q-tashasmith on 3/19/15.
 */
import java.util.Scanner;
public class PrettyTitle {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Title >");
        String title = input.nextLine();

        System.out.println(Capitalize(title));
        System.out.println(PrettyTitle(title));

    }

    public static String PrettyTitle(String title) {

        String underLine = "";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) != ' ') {
                underLine += "^"; }
            else
                underLine += " ";
        }
        return underLine;

    }

    public static String Capitalize(String title) {

        String newTitle ="";

        for (int i = 0; i < title.length(); i++) {

            if (i == 0)
                newTitle = title.substring(i, i+1).toUpperCase();
            else if (title.charAt(i - 1) == ' ')
                newTitle += title.substring(i, i+1).toUpperCase();
            else
                newTitle += title.charAt(i);
        }
        return newTitle;

    }

}

