import java.util.Scanner;
public class pattern7 {
        public static void main (String args []){
        int ch = 65;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for(int line=0; line<=n; line++){
            for ( char chars=0; chars<=line; chars++){
                System.out.print((char)(ch+chars)+" ");
                
            }
            System.out.println();
        }
    }
}







        

