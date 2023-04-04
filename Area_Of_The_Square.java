import java.util.Scanner;

public class Area_Of_The_Square {
    public static void main (String args[])
    { 
        //int side1,side2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of 1 side ");
        int side1=sc.nextInt();
        System.out.println("Enter the value of 2 side ");
        int side2=sc.nextInt();
        int area = side1*side2;
        System.out.println("Area of Square " + area);



    }

    
}
