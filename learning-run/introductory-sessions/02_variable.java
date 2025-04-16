public class Main {
    public static void main(String[] args) {
        // 02 - Variables
        // (i) Primitive -> Value stored directly in memory.
        // (ii) Reference -> Memory address (stack) that points to the heap.

        // declaration
        int age;
        int height;

        // assignment
        age = 21;
        height = 178;

        System.out.println(age);
        System.out.println(height);

        System.out.println("The student's age is " + age + " and his height is " + height);

        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println(temperature + " F");

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(currency);
        System.out.println(symbol);

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(isStudent);

        if (isStudent) {
            System.out.println("You are a student!");
        } else {
            System.out.println("You are not a student.");
        }

        String name = "GitHub";

        System.out.println("I am on " + name);

        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Your email is " + email);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your GPA is: " + gpa);

    }
}
