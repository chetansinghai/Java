/*

*
**
***
**** 
      */
import java.util.Scanner;

public class pattern1 {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            for ( int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
