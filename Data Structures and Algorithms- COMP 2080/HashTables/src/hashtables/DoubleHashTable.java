package hashtables;

public class DoubleHashTable {
     private String[] hashData;
    private int numItems;
    private int maxItems;
    private double loadFactor;
    
    public DoubleHashTable(int size,double lf){
        hashData = new String[size];
        maxItems=size;
        numItems=0;
        loadFactor=lf;    
    }
    
    public int hashFunction(String item){
        int value=0,weight=1;
        for (int x = 0 ;x <item.length();x++){
            value+= weight*item.charAt(x);
            weight++;
        } 
        return value%maxItems;
    }
    
    public int incHashFunction(String item){
        int value=0,weight=1;
        for (int x = 0 ;x <item.length();x++){
            value+= weight*item.charAt(x);
            weight++;
        } 
        return value%(maxItems/3)+1;     
    }
    
    public void add(String word){
        if (numItems/maxItems < loadFactor){
            int loc = hashFunction(word);
            int inc =incHashFunction(word);
            System.out.println(word+" hashed to "+loc);
            while(hashData[loc]!=null && !hashData[loc].equals("__DELETED__")){
                loc = (loc + inc )%maxItems;
            }
            hashData[loc]=word;
            System.out.println(word+" was added to "+loc);
            numItems++;       
        }
    }
    
    private int search(String word){
        int loc = hashFunction(word);
        int inc =incHashFunction(word);
        while(hashData[loc]!=null && !hashData[loc].equals(word)){
                loc = (loc +inc )%maxItems;
        }
        if (hashData[loc]!=null)
            return loc;
        return -1;
    }
    
    public void delete(String word){
        int loc = hashFunction(word);
        int inc =incHashFunction(word);
        while(hashData[loc]!=null && !hashData[loc].equals(word)){
                loc = (loc + inc )%maxItems;
        }
        if (hashData[loc]!=null){
            hashData[loc]="__DELETED__";
            numItems--;
        }
    }    
    public boolean exists(String word){
        int result = search(word);
        if (result==-1)
            return false;
        return true;
    }
    
    public String retrieve(String word){
        int result = search(word);
        if (result==-1)
            return null;
        return hashData[result];
    }

    public void printTable(){
        System.out.println("_________  HASH TABLE DATA ________");
        for (int x=0; x<maxItems;x++){
            System.out.println("loc "+x+" -> "+hashData[x]);
        }
        System.out.println("________________________________");
    }
    
    
}
