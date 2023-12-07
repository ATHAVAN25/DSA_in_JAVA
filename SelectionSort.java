import java.util.*;
public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.println("enter element "+(i+1));
            array[i] = sc.nextInt();
        }

        for(int i=0;i<arraySize-1;i++)
        {
            int curr_idx = i;
            for(int j=i+1;j<arraySize;j++)
            {
                if(array[j]<array[curr_idx])
                {
                    curr_idx=j;
                }
            }
            int temp=array[i];
            array[i]=array[curr_idx];
            array[curr_idx]=temp;
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<arraySize;i++)
        {
            System.out.print(array[i]+" ");
        }
        
    }
    
}
