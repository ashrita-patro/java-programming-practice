package NumberProblems;

import java.sql.SQLOutput;

public class ProductofDigit {
    static void main(String args[]){
        int n = 23467;
        int product = 1;
        while(n>0){
            int digit = n%10;
            product = product*digit;
            n = n/10;
        }
        System.out.println(product);


    }
}
