

public class Main
{
    public static void main(String[] args)
    {
        Integer[] array = new Integer[] {12,22,1,2,331,11,12,62,642,23,222};

        quickSort(array, 0, array.length -1);

        System.out.println(Arrays.toString(array));
        
    }

    public static void quickSort(Integer[] array,int low,int high)
    {
        //check for empty or null array
        if(arr == null || arr.length == 0){
            return;            
        }
        if(low >= high){
            return;
        }
        // get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        // why not array.length
        // i know why because this is recursion, high and low will be based on
        
        // get the pivot element from the middle of the list
        int pivot = arr[middle];

        int i = low, j = high;
        while(i <= j)
        {
            //check until all values on left side array are lower than pivot
            while (arr[i] < pivot)
            {
                i++;
            }
            //check until all values on left side array are greater than pivot
            while( arr[j] > pivot)
            {
                j--;
            }
            //Now compare values from both side of lists to see if they need swaping
            //After swaping move the iterator on both lists
            if(i <= j)
            {
                swap(arr,i,j);
            }


        }

    }
    
}