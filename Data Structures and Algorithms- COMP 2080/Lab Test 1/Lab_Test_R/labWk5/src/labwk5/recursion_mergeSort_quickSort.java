
package labwk5;

public class recursion_mergeSort_quickSort {
    
    public class UnOrderedArray {
    private int[] m_array;
    private int numElements;
    private int maxSize;
    
    public UnOrderedArray(int size){
        maxSize=size;
        numElements=0;
        m_array = new int[maxSize];
    }
    
    public void addLast(int item){
        if (numElements<maxSize){
            m_array[numElements] = item;
            numElements++;           
        }      
    }
    
    public void listItems(){
        for (int index =0; index <numElements ;index++){
               System.out.print(m_array[index]+" ");
        }
        System.out.println("");
    }
    
    public void listItems(int amountToPrint){
        if ( amountToPrint<=numElements){
            for (int index =0; index <amountToPrint ;index++){
                   System.out.print(m_array[index]+" ");
            }
            System.out.println("");
        }
    }
    
    public void selectionSort(){     
        for (int start=0; start<numElements-1;start++){
            // find the smallest
            int smallestLoc =start;
            for (int index=start+1; index<numElements;index++){
                if (m_array[index]<m_array[smallestLoc]){
                    smallestLoc=index;
                }
            }      
            // swap with the starting point
            int temp =m_array[start];
            m_array[start]=m_array[smallestLoc];
            m_array[smallestLoc]=temp;
        }
    }   
    
    public void insertionSortAsc(){
        // generate starting positions
        for (int start=1; start <numElements; start++){
            int temp = m_array[start]; // save the value "pull it up"
            //insert it in order with respect to the items before it.
            int presPos =start-1;
            while (presPos>=0 && m_array[presPos]>temp){
                m_array[presPos+1]=m_array[presPos];
                presPos--;
            }
            m_array[presPos+1]=temp;      
        }           
    }

    public void mergeSortAsc(){
        mergeSortWorker(0,numElements-1);  
    }
    
    public void mergeSortWorker (int left, int right){
         // base case stop when we have 1 item       
        if (left<right){
            int mid = (left+right)/2;
            mergeSortWorker(left,mid);
            mergeSortWorker(mid+1,right);
            merge(left,mid,right);    
        }     
    }
    
    public void merge(int left,int mid, int right){
        int[] leftArray = new int[mid-left+1];
        int[] rightArray = new int[right-mid];
       
        for (int x=0;x<leftArray.length;x++){
            leftArray[x]=m_array[left+x];
        }
        
        for (int x=0;x<rightArray.length;x++){
            rightArray[x]=m_array[mid+1+x];
        }
        // now merge
        int p1=0,p2=0,pM=left;
        
        while (p1<leftArray.length && p2 <rightArray.length){
            if (leftArray[p1]<rightArray[p2]){
                m_array[pM]=leftArray[p1];
                p1++;
            }else{
                m_array[pM]=rightArray[p2];
                p2++;
            }
            pM++;
        }
        
        while (p1<leftArray.length ){
            m_array[pM]=leftArray[p1];
            p1++;
            pM++;
        }
        
        while (p2<rightArray.length ){
            m_array[pM]=rightArray[p2];
            p2++;
            pM++;
        }
    }
  
    public void quickSortAsc(){
        quickSortWorker(0,numElements-1);      
    }
    
    private void quickSortWorker(int lo,int hi){
        if (lo < hi){
            int pivotPoint = partition(lo,hi);
            quickSortWorker(lo,pivotPoint-1);
            quickSortWorker(pivotPoint+1,hi);         
        }       
    }
   
    private void swap(int location1,int location2){
        int temp =m_array[location1];
        m_array[location1] = m_array[location2];
        m_array[location2 ]= temp;       
    }
    
    private int partition (int lo, int hi){
        int pivot = m_array[hi]; // always picks hi as the pivot
        int marker= lo-1,temp; // This marks the last item in the left partition
        for (int presPos=lo;presPos<hi;presPos++){
            if (m_array[presPos] < pivot){  // only moves when an item that is smaller is found
                marker++;
                //swap(marker,presPos);
                temp =m_array[marker];
                m_array[marker] = m_array[presPos];
                m_array[presPos ]= temp; 
            }          
        }
        temp =m_array[marker+1];
        m_array[marker+1] = m_array[hi];
        m_array[hi ]= temp;    
        return marker+1;
    }  
    
}
    
}
