import java.util.Scanner;

public class SafeInput {
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ":");
            retString = pipe.nextLine();
        }
        while (retString.length() == 0);

        return retString;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int userInput = 0;
        String trash = " ";
        boolean keepGoing = false;

        do {
            System.out.print("\n" + prompt + ":");
            if (pipe.hasNextInt())
            {
                userInput = pipe.nextInt();
                pipe.nextLine();
                keepGoing = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println(trash + " is not a valid integer, try again!");
                keepGoing = false;
            }
        }while (!keepGoing);

        return userInput;

    }
}

