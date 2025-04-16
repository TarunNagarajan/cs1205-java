import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double gpa = scanner.nextDouble();

        // Camel-case Line, Int, Double

        System.out.println("Hello " + name);
        scanner.close();

        // A common problem in Java is that after accepting an int
        // you get a newline, which means that the buffer is not cleared.
        // scanner.nextLine() to clear the buffer.
    }
}
