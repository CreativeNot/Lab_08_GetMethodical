import java.util.Scanner;

public class DevTest {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        int value;

        /*

        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        System.out.println("\n Your full name is: " + firstName + " " + lastName);

         */
        value = SafeInput.getInt(in, "Enter a valid number");
        System.out.println(value);

    }

}