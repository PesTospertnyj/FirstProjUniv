package lab2.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        int strNumber;
        while (true) {
            System.out.println("How many Strings do you want to insert?");
            try {
                Scanner sn = new Scanner(System.in);
                strNumber = sn.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Warning! You inserted not a String!");
            }
        }
        String strArr[] = new String[strNumber];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strNumber; i++) {
            System.out.println("String number " + (i + 1));
            strArr[i] = scan.nextLine();
        }
        int strSum = 0;
        int strAvg = 0;
        for (int i = 0; i < strArr.length; i++) {
            strSum += strArr[i].length();
        }
        strAvg = strSum / strNumber;
        System.out.println("Strings with length less, then avg length and number of symbols! ");

        for (String line: strArr) {
            if (line.length() < strAvg) {
                System.out.println(line + ", " + line.length());
            }
        }

    }
}
