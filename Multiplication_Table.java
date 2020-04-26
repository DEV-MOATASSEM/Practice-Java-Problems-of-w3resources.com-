import java.util.Scanner;
public class Multiplication_Table {
    
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number or Multiplication Table:");
        final int y = scan.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(y+"x"+i+"="+(y*i));
            }
    }

}