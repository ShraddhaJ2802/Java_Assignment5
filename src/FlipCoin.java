import java.util.*;
public class FlipCoin {
        public static void main(String[] args)
        {
            int headCount=0,tailCount=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no.of times you want to flip the coin:");
            int n = sc.nextInt();
            for (int i=1;i<=n;i++) {
                double random = Math.random();
                if (random < 0.5) {
                    tailCount++;
                    System.out.println("Tails");
                } else {
                    headCount++;
                    System.out.println("Heads");
                }
            }
            System.out.println(headCount+" no.of tmes head flip the coin");
            System.out.println(tailCount+" no.of tmes tail flip the coin");
            double headPercentage=headCount/(double)n *100;
            double tailPercentage=tailCount/(double)n *100;
            System.out.println("Percentage of head is:"+headPercentage);
            System.out.println("Percentage of tail is:"+tailPercentage);
        }
    }


