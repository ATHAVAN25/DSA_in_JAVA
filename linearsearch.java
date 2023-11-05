import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // get arr size from user
        System.out.println("Enter array size : ");
        int arr_size = input.nextInt();
        int[] arr = new int[arr_size];
        // get input from user
        for(int index=0; index<arr_size; index++){
            System.out.println("Enter element "+(index+1));
            arr[index] = input.nextInt();
        }
        System.out.println("Enter target value : ");
        int target = input.nextInt();
        boolean got=false;
        got = searchTarget(arr_size, arr, target);
        if(got)
        {
            System.out.println("Your targer value is in array");
        }
        else{
            System.out.println("Your target value is not in array");
        }  
    }
    // search the target value 
    public static boolean searchTarget(int arr_size, int[] arr, int target)
    {
        for(int index=0; index<arr_size; index++)
        {
            if(arr[index]==target)
            {
                return true;
            }
        }
        return false;
    }
}
//                   <----end---->