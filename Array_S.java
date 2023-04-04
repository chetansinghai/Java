import java.util.Arrays;
import java.util.Scanner;
public class Array_S {
    public static void Change( String name[]){
     name[2]= "Chetan";
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[3];
        for(int i=0; i<name.length;i++ ){
         name[i] = sc. next();
        }
        System.out.println( Arrays.toString(name));
        Change(name);
        System.out.println( Arrays.toString(name));
    }
}
