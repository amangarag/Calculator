import java.util.*;

class calculator {
    public static void main(String[] args) {
        int a, b, c, d, n;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("\t\tCALCULATOR\t\t");
            System.out.println("Press 1 for ADDITION.");
            System.out.println("Press 2 for SUBTRACTION.");
            System.out.println("Press 3 for MULTIPLICATION.");
            System.out.println("Press 4 for DIVIVSION.");
            System.out.print("Enter Operation Choice : ");
            n = in.nextInt();

            System.out.print("Enter 1st no. : ");
            a = in.nextInt();
            System.out.print("Enter 2nd no. : ");
            b = in.nextInt();
        }
        if (n == 1) {
            c = a + b;
            System.out.println("The Sum of given numbers is " + c);
        } else if (n == 2) {
            c = a - b;
            System.out.println("Difference of given numbers is " + c);
        } else if (n == 3) {
            c = a * b;
            System.out.println("Product of given numbers is " + c);
        } else if (n == 4) {
            // d=a%b;
            c = a / b;
            d = a % b;
            System.out.println("Quotient is " + d);
            System.out.println("Reminder is " + c);
        }
    }
}