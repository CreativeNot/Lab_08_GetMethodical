import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double price;
        double pricetotal = 0;
        boolean yesno;

        do
        {
            price = SafeInput.getRangedDouble(in, "Enter price of item [.01-9.99]", 0.01, 9.99);
            in.nextLine();
            pricetotal = pricetotal + price;
            yesno = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]");
        }
        while(yesno);
        System.out.println("The total is: " + pricetotal);

    }
}
