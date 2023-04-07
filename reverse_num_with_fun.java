import java.util.Scanner;
public class reverse_num_with_fun {
public static int reminder(int number){
      int rev=0;
    while(number>0)
    { 
        int last_Digit= number%10;
     rev = rev*10+last_Digit;
       number = number/10;
        
       
    }return(rev);
  }
    public static void main(String args[]){
        Scanner sc = new Scanner (System .in);
        System.out.println("Enter the numbers");
        int number = sc.nextInt();
        int new_number= reminder(number);
        System.out.println(new_number);
}
}