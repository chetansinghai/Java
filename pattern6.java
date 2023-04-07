/*
a
bc
def
ghij
klmno
 */
import java.util.Scanner;
public class pattern6 {
        public static void main (String args []){
        char ch = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int line=1; line<=n; line++){
            for ( int chars=1; chars<=line; chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}



