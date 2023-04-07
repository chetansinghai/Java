 import java.util.Scanner; 
 
 public class Even_odd_sum {
    public static void main (String args[]){

        Scanner sc=new Scanner(System.in);
        int choice ;
        int sumEven=0;
        int sumOdd=0;
        int num;
        do{


            System.out.println("enter the num" );
            num=sc.nextInt();
            if(num%2==0){ 

               System.out.println("num is even");
                 sumEven += num;
            }
             else{

               System.out.println("num is odd");
                sumOdd += num;

             }
             System.out.println("enter your choice 0/1");
             choice=sc.nextInt();
             
            }  
             while(choice==1);
           System.out.println("sum of even num" +sumEven);
           System.out.println("sum of odd num" +sumOdd);

    }
}
