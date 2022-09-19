package _labtest1;

import static jdk.nashorn.internal.objects.NativeString.indexOf;

public class _Controller {

    private int numEle;
    private int maxSz;
    private _Student[] st_array;

    public _Controller(int n) {
        numEle = 0;
        maxSz = n;
        st_array = new _Student[maxSz];
    }

//    public void addInto(int iD, String name, float gpa) {
//
//        if (numEle < maxSz) {
//            st_array[numEle] = new _Student(iD, name, gpa);
//            numEle++;
//        }
//    }

    public void showItem(int size) {
        for (int x = 0; x < size; x++) {
            System.out.println(st_array[x].toString() + " ");
        }

    }

    public void selectionSort() {
        for (int a = 0; a < numEle; a++) {
            int smllest = a;

            for (int sec = a + 1; sec < numEle; sec++) {
                if (st_array[sec].getiD() < st_array[smllest].getiD()) {
                    smllest = sec;
                }
            }

            _Student b = st_array[smllest];
            st_array[smllest] = st_array[a];
            st_array[a] = b;

        }
    }

    public void insertionSort() {
        for (int begin = 1; begin < numEle; begin++) {
            _Student temp = st_array[begin];
            int prePos = begin - 1;
            while (prePos >= 0 && temp.getiD() < st_array[prePos].getiD()) {
                st_array[prePos + 1] = st_array[prePos];
                prePos--;
            }
            st_array[prePos + 1] = temp;
        }
    }

    public void addInto_2(int iD, String name, float gpa) {
        if (numEle < maxSz) {
            st_array[numEle] = new _Student(iD, name, gpa);
            numEle++;
        }
        _Student temp = st_array[numEle - 1];
        int prePos = numEle - 2;
        while (prePos >= 0 && temp.getiD() < st_array[prePos].getiD()) {
            st_array[prePos + 1] = st_array[prePos];
            prePos--;
        }
        st_array[prePos + 1] = temp;

    }

    
//    public void addInto_2(int iD) {
//        if (numEle < maxSz) {
//            st_array[numEle] = new _Student(iD);
//            numEle++;
//        }
//        _Student temp = st_array[numEle - 1];
//        int prePos = numEle - 2;
//        while (prePos >= 0 && temp.getiD() < st_array[prePos].getiD()) {
//            st_array[prePos + 1] = st_array[prePos];
//            prePos--;
//        }
//        st_array[prePos + 1] = temp;
//
//    }
    
    public int binarySearch(int key) {

        //int i = Integer.parseInt("Unseccessfull");

        int lo = 0, hi = numEle - 1, mid;
        int ab;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (st_array[mid].getiD() == key) {
                
                return mid;
            }
            if (st_array[mid].getiD() < key) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
    
    public int linear(int key){
        int i = Integer.parseInt("Unseccessfull");
        for(int a = 0; a<numEle; a++){
            if (st_array[a].getiD() == key){
                return a;
            }
        }
        return i;
    }

}
