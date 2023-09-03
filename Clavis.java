import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clavis {
    public static void main(String[] args) throws FileNotFoundException {
        int option;
        Scanner input = new Scanner(System.in);
        String fileName = "./Clavis.txt";

        do {
            option = getOption(input);
            switch (option) {
                case 1:
                    displayData(fileName);
                    break;
            }
        } while (option != 0);
        input.close();
    }

    public static void sort(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.canRead()) {
            System.out.println("ERROR: Permision to read from file denied");
            System.exit(1);
        }

        Scanner input = new Scanner(file);

    }

    public static void displayData(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.canRead()) {
            System.out.println("ERROR: Permision to read from file denied");
            System.exit(1);
        }

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String id = input.next();
            String platform = input.next();
            String description = input.next();
            String email = input.next();
            String name = input.next();
            String password = input.next();
            String other = input.next();
            System.out.println();
            System.out.printf("Platform    | %s\n", platform);
            System.out.printf("Description | %s\n", description.equals("*") ? "" : description);
            System.out.printf("Email       | %s\n", email.equals("*") ? "" : email);
            System.out.printf("Name        | %s\n", name.equals("*") ? "" : name);
            System.out.printf("Password    | %s\n", password);
            System.out.printf("Forget key  | %s\n", other.equals("*") ? "" : other);
            System.out.printf("ID          | %s\n", id);
            System.out.println();
        }

        input.close();
    }

    public static int getOption(Scanner input) {
        System.out.println();
        System.out.println("---------------- Clavis ----------------");
        System.out.println("1 - Display data");
        System.out.println("2 - Add data");
        System.out.println("3 - Delete data");
        System.out.println("0 - Exit");
        System.out.print("Choose an option (enter number): ");
        return input.nextInt();
    }

}
