/* 

****
***
**
* 
    */

import java.util.Scanner;
public class pattern2 {
    
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
           // for ( int star=line; star<=n; star++)
             for ( int star=1; star<=(n-line+1); star++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

