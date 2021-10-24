package practice;
import java.util.Scanner;
public class opposite_sign {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number");
        number = input.nextInt();
        input.close();
        if (number > 0){
            System.out.printf(" number is Possitive");
        }
        else{
            System.out.printf(" number is Negative");
        }
    }
}
