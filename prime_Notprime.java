import java.util.Scanner;
public class prime_Notprime {
    public static void main (String args []){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();
    boolean prime = true;
    for(int div=2;div<num;div++)
    {
        if(num%div==0){
           prime=false;
          // div++;
          //break;
        //  System.out.println("number is not prime");
         // break;
       // }else{
        //   System.out.println("is  prime");
        }
        }
        System.out.println(prime);
        if (prime == true){
            System.out.println("number is prime");
       }else{
           System.out.println("is not prime");
        }
    }
}
