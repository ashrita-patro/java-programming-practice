package NumberProblems;
import java.util.Scanner;
public class Smallestdigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest = 1;
        while(n>0){
            int digit = n%10;
            if(digit<smallest){
                smallest = digit;
            }
            n = n/10;
        }
        System.out.println(smallest);

    }
}
