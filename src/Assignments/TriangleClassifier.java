package Assignments;

import java.util.Scanner;

/**Write a program that classifies a triangle based on its side lengths. Given three input values
 * representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal),
 * isosceles (exactly two sides are equal), or scalene (no sides are equal).
 * Use an if-else statement to classify the triangle.
 */

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the below values for all 3 sides :");
        int a = scanner.nextInt();
        System.out.println("the value of a :" + a);
        int b = scanner.nextInt();
        System.out.println("the value of b :" + b);
        int c = scanner.nextInt();
        System.out.println("the value of c :" + c);
        if(a == b && a == c && c==b){
            System.out.println("As per given i/p all 3 sides are equal its triangle");
        }else if(a==b || a!=c && b==c )
        {
            System.out.println("2 sides are equal its an isosceles");
        }
        else
        {
            System.out.println("No sides are equal its a scalene");
        }

    }
}
