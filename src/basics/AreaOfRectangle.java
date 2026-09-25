package basics;
import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        System.out.println(length*breadth);
    }
}
