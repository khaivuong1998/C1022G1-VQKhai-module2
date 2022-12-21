package ss15_exception_and_debug.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoCheckedException {
    public static void readFile() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            int number = Integer.parseInt(scanner.nextLine());
            System.out.println(number);
            FileReader fileReader = new FileReader("abc");
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception FileNotFoundException");
        }
        catch (NumberFormatException e) {
            System.out.println("Exception NumberFormatException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("kết thúc chương trình");
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
