package basics;
import java.util.Scanner;
public class SwapOfTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //temp -->temporary var
        int temp = a;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a +"b:"+b);


    }
}
