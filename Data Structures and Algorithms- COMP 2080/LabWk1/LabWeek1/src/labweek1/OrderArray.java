package labweek1;

/**
 *
 * @author cu_bi
 */
public class OrderArray {

    private int[] m_array;
    private int maxSize;
    private int numEle;

    public OrderArray(int size) {
        maxSize = size;
        numEle = 0;
        m_array = new int[maxSize];
    }

    public void addInOrder(int item) {

        if (numEle < maxSize) {
            m_array[numEle] = item;
            numEle++;
        }

        int temp = m_array[numEle - 1];
        // insert temp in the correct position with respect to the items before
        int prePos = numEle - 2;
        while (prePos >= 0 && temp < m_array[prePos]) {
            m_array[prePos + 1] = m_array[prePos];
            prePos--;
        }
        m_array[prePos + 1] = temp;
    }

    public void listItem() {
        for (int ind = 0; ind < numEle; ind++) {
            System.out.print(m_array[ind] + " ");
        }
        System.out.println(" ");
    }

    public void listItem(int size) {
        for (int ind = 0; ind < size; ind++) {
            System.out.print(m_array[ind] + " ");
        }
        System.out.println(" ");
    }

    public int binarySearch(int key) {
        int lo = 0, hi = numEle-1, mid;
        
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(m_array[mid] == key){
               return mid; 
            }
            if(m_array[mid] < key){
               lo= mid +1; 
            }else{
                hi = mid -1;
            }
            
        }
        return -1;
   
}

}
