import java.util.Scanner;

public class Power {
    public static void main(String[] args)
    {
        // INITIALIZATION
        int num, mul = 1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no to print the power of 2:");
        num = sc.nextInt();

        // CONDITION CHECK
        if (num > 31) {
            System.out.println("value of number should be less than 31");
        }
        // COMPUTATION
        else {
            System.out.println(mul);
            for (int j = 1; j <= num; j++) {
                mul = mul * 2;
                System.out.println("Power of "+2+"is");
            }
        }
    }
}
