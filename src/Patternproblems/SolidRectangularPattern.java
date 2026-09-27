package Patternproblems;
import java.util.Scanner;
public class SolidRectangularPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=N; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
