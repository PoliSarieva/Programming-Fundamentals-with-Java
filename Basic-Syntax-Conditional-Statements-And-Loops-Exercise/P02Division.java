import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisible = Integer.parseInt(scanner.nextLine());

        //2, 3, 6, 7, 10
            if (divisible % 10 == 0) {
                System.out.println("The number is divisible by 10");
            } else if (divisible % 7 == 0) {
                System.out.println("The number is divisible by 7");
                } else if (divisible % 6 == 0) {
                System.out.println("The number is divisible by 6");
            } else if (divisible % 3 == 0) {
                System.out.println("The number is divisible by 3");
            } else if (divisible % 2 == 0) {
                System.out.println("The number is divisible by 2");
            } else {
                System.out.println("Not divisible");
            }
    }
}

