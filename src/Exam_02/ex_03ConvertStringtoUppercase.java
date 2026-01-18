package Exam_02;

import java.util.Scanner;

public class ex_03ConvertStringtoUppercase {
    public static void main(String[] args) {
        /**String user_ip="lalita";
        System.out.println(user_ip.toUpperCase());**/
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter words in small:");
        String user_ip= scanner.next();
        System.out.println("Uppercase :"+user_ip.toUpperCase());
    }
}
