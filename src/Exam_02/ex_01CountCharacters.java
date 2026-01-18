package Exam_02;
//
import java.util.Scanner;

public class ex_01CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string :");
        String user_ip = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < user_ip.length(); i++) {
            if (user_ip.charAt(i) != ' ') {
                count++;

            }
        }
        System.out.println("Total number of character in string:" + count);

    }

    }

