package basics;
import java.util.Scanner;
public class CalculatePercentage {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int passingmark = sc.nextInt();
         int totalmark = sc.nextInt();
         double percentage = ((double) passingmark/totalmark)*100;
         System.out.println(percentage);

     }
}

