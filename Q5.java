/*5. Write a Java program that takes two numbers as input and display the product of two numbers.*/
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int x=scan.nextInt();
        System.out.print("Enter the 2nd number:");
        int y=scan.nextInt();  
        System.out.println("Product of "+x+" and "+y+" is ="+(x*y));
    }

}