package lab2.tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        int strNumber;
        while (true) {
            System.out.println("������� ����� ������� ������?");
            try {
                Scanner sn = new Scanner(System.in);
                strNumber = sn.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("������! ������ ����� ����� �����!");
            }
        }
        String strArr[] = new String[strNumber];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < strNumber; i++) {
            System.out.println("������� ������ " + (i + 1));
            strArr[i] = scan.nextLine();
        }
        int strSum = 0;
        int strAvg = 0;
        for (int i = 0; i < strArr.length; i++) {
            strSum += strArr[i].length();
        }
        strAvg = strSum / strNumber;
        System.out.println("������ � ������� ������ ������� � �� ������! ");

        for (String line: strArr) {
            if (line.length() < strAvg) {
                System.out.println(line + ", " + line.length());
            }
        }

    }
}
