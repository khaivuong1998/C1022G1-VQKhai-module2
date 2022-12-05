package module_2.ss1_introduction_java;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("out of ability");
                break;
        }
        if (number >= 10 && number < 20) {
            int b = number % 10;
            switch (b) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }
        if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            switch (tens) {
                case 2:
                    System.out.print("twenty" + "_");
                    break;
                case 3:
                    System.out.print("thirty" + "_");
                    break;
                case 4:
                    System.out.print("forty" + "_");
                    break;
                case 5:
                    System.out.print("fifty" + "_");
                    break;
                case 6:
                    System.out.print("sixty" + "_");
                    break;
                case 7:
                    System.out.print("seventy" + "_");
                    break;
                case 8:
                    System.out.print("eighty" + "_");
                    break;
                case 9:
                    System.out.print("ninety" + "_");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
        if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int tens = (number / 10) % 10;
            int ones = number % 10;
            if (number % 100 == 0) {
                switch (hundreds) {
                    case 1:
                        System.out.println("one hundred");
                        break;
                    case 2:
                        System.out.println("two hundred");
                        break;
                    case 3:
                        System.out.println("three hundred");
                        break;
                    case 4:
                        System.out.println("four hundred");
                        break;
                    case 5:
                        System.out.println("five hundred");
                        break;
                    case 6:
                        System.out.println("six hundred");
                        break;
                    case 7:
                        System.out.println("seven hundred");
                        break;
                    case 8:
                        System.out.println("eight hundred");
                        break;
                    case 9:
                        System.out.println("nine hundred");
                        break;
                }
            } else {
                switch (hundreds) {
                    case 1:
                        System.out.print("one hundred and ");
                        break;
                    case 2:
                        System.out.print("two hundred and ");
                        break;
                    case 3:
                        System.out.print("three hundred and ");
                        break;
                    case 4:
                        System.out.print("four hundred and ");
                        break;
                    case 5:
                        System.out.print("five hundred and ");
                        break;
                    case 6:
                        System.out.print("six hundred and ");
                        break;
                    case 7:
                        System.out.print("seven hundred and ");
                        break;
                    case 8:
                        System.out.print("eight hundred and ");
                        break;
                    case 9:
                        System.out.print("nine hundred and ");
                        break;
                }
                switch (tens) {
                    case 0:
                        switch (ones) {
                            case 0:
                                System.out.println("");
                                break;
                            case 1:
                                System.out.print("one");
                                break;
                            case 2:
                                System.out.print("two");
                                break;
                            case 3:
                                System.out.print("three");
                                break;
                            case 4:
                                System.out.print("four");
                                break;
                            case 5:
                                System.out.print("five");
                                break;
                            case 6:
                                System.out.print("six");
                                break;
                            case 7:
                                System.out.print("seven");
                                break;
                            case 8:
                                System.out.print("eight");
                                break;
                            case 9:
                                System.out.print("nine");
                                break;
                        }
                        break;
                    case 1:
                        switch (ones) {
                            case 0:
                                System.out.print("ten");
                                break;
                            case 1:
                                System.out.print("eleven");
                                break;
                            case 2:
                                System.out.print("twelve");
                                break;
                            case 3:
                                System.out.print("thirteen");
                                break;
                            case 4:
                                System.out.print("fourteen");
                                break;
                            case 5:
                                System.out.print("fifteen");
                                break;
                            case 6:
                                System.out.print("sixteen");
                                break;
                            case 7:
                                System.out.print("seventeen");
                                break;
                            case 8:
                                System.out.print("eighteen");
                                break;
                            case 9:
                                System.out.print("nineteen");
                                break;
                        }
                        break;
                    case 2:
                        System.out.print("twenty" + "_");
                        break;
                    case 3:
                        System.out.print("thirty" + "_");
                        break;
                    case 4:
                        System.out.print("forty" + "_");
                        break;
                    case 5:
                        System.out.print("fifty" + "_");
                        break;
                    case 6:
                        System.out.print("sixty" + "_");
                        break;
                    case 7:
                        System.out.print("seventy" + "_");
                        break;
                    case 8:
                        System.out.print("eighty" + "_");
                        break;
                    case 9:
                        System.out.print("ninety" + "_");
                        break;
                }
                if (tens > 1) {
                    switch (ones) {
                        case 0:
                            System.out.println("");
                            break;
                        case 1:
                            System.out.print("one");
                            break;
                        case 2:
                            System.out.print("two");
                            break;
                        case 3:
                            System.out.print("three");
                            break;
                        case 4:
                            System.out.print("four");
                            break;
                        case 5:
                            System.out.print("five");
                            break;
                        case 6:
                            System.out.print("six");
                            break;
                        case 7:
                            System.out.print("seven");
                            break;
                        case 8:
                            System.out.print("eight");
                            break;
                        case 9:
                            System.out.print("nine");
                            break;
                    }
                }
            }
        }
    }
}
