package practice;
import java.util.Scanner;

public class odd_even {
        public static void main(String[] args)
        {
            int n;
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number:");
            n = s.nextInt();
            if(n % 2 == 0)
            {
                System.out.println("The given number is Even ");
            }
            else
            {
                System.out.println("The given number is Odd ");
            }
        }
    }

