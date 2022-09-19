package lab_test_r;

public class OrderedObjects {

    public int numEle;
    public int maxSz;
    public Flight[] fl_array;

    public OrderedObjects() {
        numEle = 0;
        maxSz = 1000;
        fl_array = new Flight[maxSz];
    }

    public boolean addObject(int flightNum, int pilotEmployeeNo, String aircraftNum, int comChannel) {
        if (numEle < maxSz) {
            fl_array[numEle] = new Flight(flightNum, pilotEmployeeNo, aircraftNum, comChannel);
            numEle++;
            System.out.println("Adding Successfully");

        } else {
            System.out.println("List is Full!");
            return false;
        }
        Flight temp = fl_array[numEle - 1];
        int prePos = numEle - 2;
        while (prePos >= 0 && temp.comChannel < fl_array[prePos].comChannel) {
            fl_array[prePos + 1] = fl_array[prePos];
            prePos--;
        }
        fl_array[prePos + 1] = temp;
        return true;
    }

    public boolean itemExists(int c) {
        for (int x = 0; x < 1000; x++) {
            if (c == fl_array[x].comChannel) {
                System.out.println(fl_array[x].comChannel);
            } else {
                System.out.println("No Matching!!");
                return false;
            }

        }
        return true;
    }

    public int binarySearch(int c) {
        int lo = 0, hi = numEle - 1, mid;
        int ab;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (fl_array[mid].comChannel == c) {

                return mid;
            }
            if (fl_array[mid].comChannel < c) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    public void deleteObject(int c) {
        for (int x = 0; x < 1000; x++) {
            if(c == fl_array[x].comChannel){
                
                System.out.println("Remove Successfully!!");
            ;
            }
        }
    }
    
    public void printElements(){
        for (int x = 0; x < 1000; x++) {
            System.out.println(fl_array[x].toString());
        }
    }

}
