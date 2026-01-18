package Exam_02;
import java.util.Scanner;

public class ex_04Compare2strings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first line:" );
        String str1= scanner.next();
        System.out.println("Enter second line:");
        String str2=scanner.next();
        System.out.println("Enter second line:"+str2);
        System.out.println(str1.equalsIgnoreCase(str2));


    }

}
