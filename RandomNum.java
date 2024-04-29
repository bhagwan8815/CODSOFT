import java.util.*;

public class RandomNum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
         int attemp =0;
         int num;
        Random rem = new Random();


        int random_num = rem.nextInt(100);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("*********************---WELCOME TO GUESS NUMBER GAME----**********************");
     
        do {
            attemp++;
            System.out.println("enter your number : ");
            num = sc.nextInt();

            if (num == random_num) {
                System.out.println("Congratulations ! you guess the correct number :");
                System.out.println("your attemp is " +  attemp);
            }

           else  if (num > random_num) {
                System.out.println("your number is high , please enter the low number :");
            } else {
                System.out.println("your number is low, please enter the high number :");
            }
        } while (num != random_num);

    }

}
