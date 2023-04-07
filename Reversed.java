import java.util.Scanner;
public class Reversed {
    public static void main(String args[]){
    Scanner sc = new Scanner (System .in);
    System.out.println("Enter the numbers");
    int number = sc.nextInt();
    int rev=0;
    while(number>0)
    { 
        int last_Digit= number%10;
          rev = rev*10+last_Digit;
             number=number/10;
       
    }
   System.out.print(rev);

    }
    
}
