package labweek1;

public class UnOrderArray {

    private int[] m_array;
    private int maxSize;
    private int numEle;

    public UnOrderArray(int size) {
        maxSize = size;
        numEle = 0;
        m_array = new int[maxSize];
    }

    public void addLast(int item) {

        if (numEle < maxSize) {
            m_array[numEle] = item;
            numEle++;
        }
    }

    public void listItem(int size) {
        for (int ind = 0; ind < size; ind++) {
            System.out.print(m_array[ind] + " ");
        }
        System.out.println(" ");
    }

    public void selectionSort() {
        for (int start = 0; start < numEle; start++) {
            int smllestLocation = start;
            // Find the smallest (pls note the location of the what we need)
            for (int ind = start; ind < numEle; ind++) {
                if (m_array[ind] < m_array[smllestLocation]) {
                    smllestLocation = ind;
                }
            }
            // Swap position with the starting item
            int temp = m_array[start];
            m_array[start] = m_array[smllestLocation];
            m_array[smllestLocation] = temp;

        }
    }

    public void insertionSort() {

        for (int start = 1; start < numEle; start++) {
            int temp = m_array[start];
            // insert temp in the correct position with respect to the items before
            int prePos = start - 1;
            while (prePos >= 0 && temp < m_array[prePos]) {
                m_array[prePos + 1] = m_array[prePos];
                prePos--;
            }
            m_array[prePos + 1] = temp;
        }

    }

    public void quickSort() {
        quickSortWorker(0, numEle - 1);
    }

    private void quickSortWorker(int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(lo, hi);
            quickSortWorker(lo, pivot - 1);
            quickSortWorker(pivot + 1, hi);
        }

    }

    private void swap(int location, int location2) {
        int temp = m_array[location];
        m_array[location] = m_array[location2];
        m_array[location2] = temp;
    }

    private int partition(int lo, int hi) {
        int marker = lo - 1;
        int pivot = m_array[hi];
        for (int presPos = 0; presPos < hi; presPos++) {
            if (m_array[presPos] < pivot) {
                marker++;
                swap(marker, presPos);

            }

        }
        swap(hi, marker+1);
        return marker+1;
    }
}
