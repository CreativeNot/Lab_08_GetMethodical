import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        int fav = 0;
        double fav2 = 0;
        Scanner in = new Scanner(System.in);


        fav = SafeInput.getInt(in, "Please enter your favorite integer");
        fav2 = SafeInput.getDouble(in, "Please enter your favorite double");
        System.out.println("Your favorite integer is: " + fav + " and your favorite double is: " + fav2);
    }


}
