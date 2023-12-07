import java.util.Scanner;

public class InsertionSort {
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
            for(int j=i+1;j>0;j--)
            {
                if(array[j]<array[j-1])
                {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<arraySize;i++)
        {
            System.out.print(array[i]+" ");
        }
    
    }
}
