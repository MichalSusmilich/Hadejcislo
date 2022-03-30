package Hadejcislo;

import java.util.Scanner;

public class Hadej {

    static Scanner sc = new Scanner(System.in);

    public static void main(String a[]) {
        boolean menu = true;
        while (menu == true) {
            System.out.println("");
            System.out.println("1 - For you guess number against the computer");
            System.out.println("2 - For computer quess your number");
            System.out.println("Other key for end");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    Game g = new Game();
                    boolean b = false;
                    while (!b) {
                        g.takeUserInput();
                        b = g.isCorrectNumber();
                    }
                    break;
                case "2":
                    int count = 100;
                    hadejcislo bs = new hadejcislo();

                    int[] inputArr = bs.takeInputsInCount(count);
                    System.out.println("For every question, press Enter if answer is YES, else you can press any other key");
                    System.out.println("Think of a number between 1 to 100, press Enter to continue");
                    String input = sc.nextLine();
                    if (input.isEmpty()) {
                        int element = bs.getElementByBinarySearch(inputArr, count);
                        System.out.println("Your number is : " + element);
                    } else {
                        System.out.println("exiting... ");

                    }
                    break;
                default:
                    menu = false;
            }

        }
    }
}
