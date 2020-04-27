import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.print("Enter the no x:");
        x=scan.nextInt();
        System.out.print("Enter the no y:");
        y=scan.nextInt();
        //swap
        int temp=0;
        temp=x;
        x=y;
        y=temp;
        System.out.println(" no x:"+x);
        System.out.println(" no y:"+y);
    }

}