package labtest2_real;

public class QuadHashTa {

    private LocationData[] tableData;
    private int numEle;
    private int maxEle;
    private double loadF;

    public QuadHashTa() {
        tableData = new LocationData[maxEle];
        maxEle = 700;
        numEle = 0;
        loadF = 0.7;
    }

    public int hashFunc(String name, int num1, int num2) {
        int val = 0, w = 1;
        for (int x = 0; x < name.length(); x++) {
            val += (w * name.charAt(x)) + (num1 + num2);
            w++;
        }
        return val % maxEle;
    }

    public boolean add(String name, int lati, int longti, int tempe) {
        if (numEle / maxEle < loadF) {
            int begin = hashFunc(name, lati, longti);
            int loc = begin, col = 0;
            while (tableData[loc] != null && !tableData[loc].equals("Delete")) {
                col++;
                loc = (begin + col * col) % maxEle;
            }
            tableData[loc] = new LocationData(name, lati, longti, tempe);
            numEle++;
            return true;
        }
        return false;
    }

    public boolean delete(String name, int lati, int longti) {
        int begin = hashFunc(name, lati, longti);
        int loc = begin, col = 0;
        while (tableData[loc] != null && !tableData[loc].equals(name) && !tableData[loc].equals(lati) && !tableData[loc].equals(longti)) {
            col++;
            loc = (begin + col * col) % maxEle;
        }
        if (tableData[loc] != null) {
            tableData[loc] = new LocationData("Delete");
            numEle--;
            return true;
        }
        return false;
    }

    public int search(String name, int lati, int longti) {
        int begin = hashFunc(name, lati, longti);
        int loc = begin, col = 0;
        while (tableData[loc] != null && !tableData[loc].equals(name) && !tableData[loc].equals(lati) && !tableData[loc].equals(longti)) {
            col++;
            loc = (begin + col * col) % maxEle;
        }
        if (tableData[loc] != null) {
            return loc;
        }
        return -1;
    }

    public String retrieve(String name, int lati, int longti, int tempe) {
        int res = search(name, lati, longti);
        String s;
        if (res == -1) {
            return null;
        } else {
            s = "Name: " + tableData[res].getName()
                    + " ; Latitude:" + tableData[res].getLatitude()
                    + " ; Longtitudde: " + tableData[res].getLongtitudde()
                    + " ; Temperature" + tableData[res].getTemperature();
        }
        return s;
    }

    public boolean update(String name, int lati, int longti, int Ntempe) {
        int res = search(name, lati, longti);
        if (res==-1)
            return false;
        else{
            tableData[res] = new LocationData(name, lati, longti, Ntempe);
            return true;
        }
    }
}
