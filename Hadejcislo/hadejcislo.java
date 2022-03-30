/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hadejcislo;
import java.util.Scanner;

/**
 *
 * @author susmi
 */
public class hadejcislo {
    static Scanner sc = new Scanner(System.in);
    int getElementByBinarySearch(int[] arr, int len) {
        int first = 0;
        int last = len - 1;
        if (isEqual(arr[first])) {
            return arr[first];
        }
        if (isEqual(arr[last])) {
            return arr[last];
        }
        while (last > first) {
            int middle = (first + last) / 2;

            if (isEqual(arr[middle])) {
                return arr[middle];
            }
            if (isGreater(arr[middle])) {
                first = middle + 1;
                if (isEqual(arr[first])) {
                    return arr[first];
                }
            } else {
                last = middle - 1;
                if (isEqual(arr[last])) {
                    return arr[last];
                }
            }

        }

        return 0;
    }

    private boolean isEqual(int m) {
        Boolean equalFlag = false;

        System.out.println("Is your number :" + m + " ?");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            equalFlag = true;
        }
        return equalFlag;

    }

    private boolean isGreater(int m) {
        Boolean equalFlag = false;

        System.out.println("Is your number greater than :" + m + " ? ");
        String input = sc.nextLine();
        if (input.isEmpty()) {
            equalFlag = true;
        }
        return equalFlag;

    }

    int[] takeInputsInCount(int count) {
        int length = count;
        int tempArray[] = new int[length];
        for (int i = 0; i < length; i++) {
            try {
                tempArray[i] = i + 1;
            } catch (Exception e) {
                break;
            }
        }

        return tempArray;
    }
}
