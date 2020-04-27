import java.util.Scanner;

//13. Write a Java program to print the area and perimeter of a rectangle. 
public class Q13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double width,length,area,perimeter;
        System.out.print("Enter the width of the Rectangle:");
        width=scan.nextInt();
        System.out.print("Enter the length of the Rectangle:");
        length=scan.nextInt();
        area=width*length;
        System.out.println("Area of thre Rectangle="+area);
        perimeter=(width+length)*2;
        System.out.println("Perimeter of thre Circle="+perimeter);
    }

}