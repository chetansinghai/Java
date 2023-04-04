public class Array1 {
     public static void main( String args[]) {
        int arr[] ={1,2,3,3,5,2,2,2};
        int value=0;
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
    
           // if(arr[i]<arr[j]) //for ascending
           if(arr[i]==arr[j])
           {
                   value++;
                   System.out.println(arr[i]);
           }
          // else {
         //          break;
         // }
           }
        } 
    
         System.out.println(value);
           if(value>3)
            {
                 System.out.println( "true");
            }
            else{
                System.out.println( "false");  ;
            }
    }}
/*public class Array1 {
 public static boolean result( int arr[]) {
    for(int i=0; i<arr.length;i++){
        for(int j=i+1; j<arr.length;j++){
       if(arr[i]==arr[j])
       {
               return true;
       }
        } 
     }
        return false;
    } 
    public static void main( String args[]) {
            int arr[] ={1,2,3,3,5,2,2,2};
        System.out.println(result(arr));
        }
    }*/