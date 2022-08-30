import java.util.Scanner;

public class JavaTest {
// main method
    public static void main(String[] args) {
        String name= "World";
        if (args.length > 0) {
            name = args[0];
        }
        System.out.println("Hello, "+ name + "! Type something fun:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }
}
