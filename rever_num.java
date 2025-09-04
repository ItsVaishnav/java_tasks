import java.util.Scanner;

public class rever_num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        while (num != 0) {
            int digit = num % 10; // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            num = num / 10; // remove last digit
        }

        System.out.println("Reversed Number: " + reversed);

        sc.close();
    }
}
