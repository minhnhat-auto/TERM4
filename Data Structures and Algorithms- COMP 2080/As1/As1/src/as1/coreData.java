package as1;

//Minh Nhat Vo - 101224717

public class coreData {
    private int[] data_array;
    private int counter;
    private int dataSize;

        
    public coreData(int size)
    {
        dataSize = size;
        counter = 0;
        data_array = new int[dataSize];
    }
    
    public void showData(int quantity)
    {
        if(quantity <= counter){
            for(int order = 0; order < quantity ; order++)
            {
                System.out.print(data_array[order] + " ");
            }
            System.out.println("");
        }
    }
    
    public void addData(int item)
    {
        if(counter < dataSize)
        {
            data_array[counter] = item;
            counter++;
        }
    }
    
    // Sorting the arrays in descending order.
    public void _Sort_By_Selection()
    {
        for(int starter = 0; starter < counter - 1; starter++)
        {
            int smallestLocker = starter;
            for(int index = starter + 1; index < counter; index++ )
                {
                    if(data_array[index] > data_array[smallestLocker]){
                        smallestLocker = index;
                    }
                }
            int tempLocker = data_array[starter];
            data_array[starter] = data_array[smallestLocker];
            data_array[smallestLocker] = tempLocker;
        }
    }
    
    // Sorting the arrays in descending order.
     public void _Sort_By_Insertion()
    {
        for(int start = 1; start < counter; start++){
            int temp = data_array[start];
            int prePos = start - 1;
            while(prePos >= 0 && data_array[prePos] < temp){
                data_array[prePos + 1] = data_array[prePos];
                prePos--;
            }
            data_array[prePos + 1] = temp;
        }
    
    }
    
    // Sorting the arrays in descending order.
    public void _Sort_By_Merge(){
        mergeOperator(0, counter - 1);
    }
    
    public void mergeOperator(int left, int right){
        if (left < right){
            int mid = (left + right)/2;
            mergeOperator(left, mid);
            mergeOperator(mid + 1, right);
            merge(left, mid, right);       
        }
    }
    
    public void merge(int left, int mid, int right){
        int[] leftArray = new int[mid - left +1];
        int[] rightArray = new int[right - mid];
        
        for(int i = 0; i<leftArray.length; i++){
            leftArray[i] = data_array[left + i];
        }
        
        for(int i = 0; i<rightArray.length; i++){
            rightArray[i] = data_array[mid + 1 + i];
        }
        
        int pOfLeft = 0, pOfRight = 0, pM = left;
        
        while(pOfLeft < leftArray.length && pOfRight < rightArray.length){
            if(leftArray[pOfLeft] > rightArray[pOfRight]){
                data_array[pM] = leftArray[pOfLeft];
                pOfLeft++;
            }else{
                data_array[pM] = rightArray[pOfRight];
                pOfRight++;
            }
            pM++;
        }
        
        while(pOfLeft < leftArray.length){
            data_array[pM] = leftArray[pOfLeft];
            pOfLeft++;
            pM++;
        }
        
        while(pOfRight < rightArray.length){
            data_array[pM] = rightArray[pOfRight];
            pOfRight++;
            pM++;
        }
    }
    
    
    public void _Sort_By_Quick(){
        quickOperator(0, counter - 1);
    }
    private void quickOperator(int lo, int hi){
        if(lo < hi){
            int pivot = data_array[hi];
            quickOperator(lo, pivot - 1);
            quickOperator(pivot + 1, hi);
        }
    }
    
    private void swap(int location1,int location2){
        int temp =data_array[location1];
        data_array[location1] = data_array[location2];
        data_array[location2 ]= temp;       
    }
    
    private int partition(int lo, int hi){
        int compPoint = data_array[hi];
        int marker= lo-1,tempPoint;
        for (int presPos=lo;presPos<hi;presPos++){
             if (data_array[presPos] > compPoint){  
                marker++;
                tempPoint =data_array[marker];
                data_array[marker] = data_array[presPos];
                data_array[presPos ]= tempPoint; 
            }          
        }
        tempPoint = data_array[marker+1];
        data_array[marker+1] = data_array[hi];
        data_array[hi] = tempPoint;
        return marker + 1;
    }
    
    
    
    // Make Ordered and Descending Array
    
    public void addInorder(int item){
        if(counter<dataSize){
            data_array[counter] = item;
            counter++;           
        } 
        
        int temp = data_array[counter-1]; 
        int presPos =counter-2;
        while (presPos>=0 && data_array[presPos]<temp){
            data_array[presPos+1]=data_array[presPos];
            presPos--;
        }
        data_array[presPos+1]=temp;      
    }
    
    //
    public int binarySearch(int key){
        int lo=0,hi=counter-1,mid;
        
        while (lo<=hi){
            mid = (lo+hi)/2;
            if (data_array[mid] == key) 
                return mid;
            if (data_array[mid] > key)
                lo=mid+1;
            else
                hi=mid-1;      
        }
        return -1;     
    }
    
    public int linearSearch(int key){
        int res;
        for(int x=0; x<counter; x++){
            if(key == data_array[x]) 
                return res = x;
        }
        return -1;
    }
    
}
