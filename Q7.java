//7. Write a Java program that takes a number as input and prints its multiplication table upto 10
import java.util.Scanner;
public class Q7 {
    
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number or Multiplication Table:");
        int y = scan.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(y+"x"+i+"="+(y*i));
            }
    }

}