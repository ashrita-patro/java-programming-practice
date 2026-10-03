package basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        float result = (principal*time*rate)/100;
        System.out.println("Simple interest is:"+result);
    }
}
