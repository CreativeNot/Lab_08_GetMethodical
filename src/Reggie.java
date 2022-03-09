import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String ssn;
        String ucID;
        String menuChoice;

        ssn = SafeInput.getRegExString(in, "Please enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println(ssn);

        ucID = SafeInput.getRegExString(in, "Please enter your M number","(M|m)\\d{5}");
        System.out.println(ucID);

        menuChoice = SafeInput.getRegExString(in, "Pick an option: Open, Save, View, Quit ", "[OoSsVvQq]");
        switch (menuChoice)
        {
            case "o": case "O":
            System.out.println("Open");
            break;
            case "s": case "S":
            System.out.println("Save");
            break;
            case "v": case "V":
            System.out.println("View");
            break;
            case "q": case "Q":
            System.out.println("Quit");
            break;
        }

    }

}
