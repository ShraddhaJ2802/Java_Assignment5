import java.util.Scanner;

public class LeapYear {
    public void is_leapYear(int year)
    {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter year is 4 digit no:");
        int year = sc.nextInt();
        if(year <= 999 || year > 9999)
        {
            System.out.println("Oops! Please enter 4 digit no year");
        }
        else
        {
            LeapYear lp=new LeapYear();
            lp.is_leapYear(year);
        }

    }
}
