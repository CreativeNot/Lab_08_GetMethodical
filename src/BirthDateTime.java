import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int hour;
        int minute;

        year = SafeInput.getRangedInt(in, "Enter the year you were born between 1950 and 2010",1950,2010);
        month = SafeInput.getRangedInt(in, "Enter the month you were born by number [e.g. Jan = 1]",1,12);
        if (month == 2)
        {
            day = SafeInput.getRangedInt(in, "Enter the day you were born [1-29]",1,29);
        }
        else if(month == 4 | month == 6 | month == 9| month == 11)
        {
            day = SafeInput.getRangedInt(in, "Enter the day you were born [1-30]",1,30);
        }
        else
        {
            day = SafeInput.getRangedInt(in, "Enter the day you were born [1-31]",1,31);
        }
        hour = SafeInput.getRangedInt(in, "Enter the hour you were born [1-24]",1,24);
        minute = SafeInput.getRangedInt(in, "Enter the minute you were born [1-59]",1,59);

        System.out.println("You were born: Year:" + year + " Month:" + month + " Day:" + day + " Hour:" + hour + " Minute:" + minute);

    }
}
