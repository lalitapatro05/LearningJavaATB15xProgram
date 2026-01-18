package Exam_02;

import java.util.Scanner;

public class ex_05Reversestring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER YOUR TEXT HERE:");
        String str1=scanner.next();
        String str2= "";
        for(int i =0;i<str1.length();i++){
            str2=str1.charAt(i)+str2;}

        {
            System.out.println("Resverse string :"+(str2));

        }

    }
}
