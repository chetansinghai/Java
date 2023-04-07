
 /*
enter the value of n
5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
   */
    import java.util.Scanner;
    public class pattern5 {
       
       public static void main (String args []){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the value of n");
           int n = sc.nextInt();
           int number=1;
           for(int line=1; line<=n; line++){
               for ( int num=1; num<=line; num++){
                   System.out.print(number++ + " ");
                   
               }
               System.out.println();
           }
       }
   }

