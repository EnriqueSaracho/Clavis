import java.io.File;
import java.util.Scanner;

public class Clavis {
    public static void main(String[] args) {
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

    public static void displayData(String fileName) {
        File file = new File(fileName);
        if (!file.canRead()) {
            System.out.println("ERROR: Permision to read from file denied");
            System.exit(1);
        }

        System.out.println();
        System.out.println(" ID |               Platform                 |     Description    ");
        System.out.println(
                "--------------------------------------------------------------------");
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
