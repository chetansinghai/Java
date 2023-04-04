import java.util.Arrays;
import java.util.Scanner;
public class ArrayC {
    public static void main(String args[])
    {
       Scanner sc =new Scanner(System.in) ;
       System.out.println("Enter the size of array");
       int n =sc.nextInt();
       int arr [] = new int [n];
      System.out.print("Enter the element of array");
       // take input using for loop
      for( int i= 0; i<arr.length; i++)
       {
       arr[i] = sc.nextInt();
       
      }
      // print output type 1 
      /* 
      for( int i= 0; i<arr .lenth; i++) {
        
         System.out.print(arr[i] +" ");
    }
    */
    // print output type 2 with for each loop
    /* 
    for(int num : arr)
    {
        System.out.print(num +" ");
    }
    */
// print output type 3 
    System .out .println(Arrays.toString (arr));
}

}