import java.util.Scanner;

//11. Write a Java program to print the area and perimeter of a circle. 
public class Q11 {
    public static void main(String[] args) {
        double radius,area,perimeter;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the radius of the Circle:");
                radius=scan.nextInt();
        area=Math.PI*Math.pow(radius, 2);
        System.out.println("Area of thre Circle="+area);
        perimeter=(2*Math.PI*radius);
        System.out.println("Perimeter of thre Circle="+perimeter);
    }

}