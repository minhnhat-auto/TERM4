
package hashtables;

public class HashTables {

    public static void main(String[] args) {
       LinearhashTable lt = new LinearhashTable(14,0.75);
       //QuadHashTable lt = new QuadHashTable(14,0.75);
//       DoubleHashTable lt = new DoubleHashTable(14,0.75);
       lt.add("nhat");
       lt.add("apple");
       lt.add("pear");
       lt.add("passionfruit");
       lt.add("orange");
       lt.add("strawberries");
       lt.add("dragonfruit");
       lt.add("blueberries");
       lt.printTable();
       lt.delete("apple");
       lt.printTable();
       System.out.println(lt.exists("apple"));
       System.out.println(lt.exists("blueberries"));
       System.out.println(lt.exists("rhododendron"));
       lt.add("apple");
       lt.printTable();
    }
    
}
