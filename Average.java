
import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int sum =0 ;
        int i;
        for ( i=1; i<=n; i++ )
          {
                  System.out.println(i);
                     sum = sum+i;
                    // System.out.println(" The Value of sum " +sum);
         }
        System.out.println(" The total sum " +sum);
         System.out.println(" The Average of n numbers" +sum/n);
        }

    }
