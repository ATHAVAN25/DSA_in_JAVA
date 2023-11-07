import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // get array size from user
        System.out.println("Enter array size : ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++)
        {
            System.out.println("Enter element "+(i+1));
            array[i] = input.nextInt();
        }
        // get target value from user
        System.out.println("Enter target value : ");
        int target = input.nextInt();
        // now sort the array
        Arrays.sort(array);
        //call function
        int position = binarySearch(array, target);
        if(position == -1)
        {
            System.out.print("Target value" + target + " not found");
        }
        else
        {
            System.out.print("Target value " + target + " found at position " + position);
        }
        
    }
    static int binarySearch(int[] array, int target){
        int start = 0, end = array.length - 1;
        while(start <= end)
        {
            int middle = start + (end -start)/2;
            if(target < array[middle])
            {
                end = middle - 1;
            }
            else if(target > array[middle])
            {
                start = middle + 1;
            }
            else 
            {
                return middle;
            }
        }
        return -1;
    }
}
