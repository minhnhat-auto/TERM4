
package binarysearchtree;

public class BinarySearchTree {

    public static void main(String[] args) {
       MyBinTree mbt = new MyBinTree();
       mbt.insert(10);
       mbt.insert(5);
       mbt.insert(28);
       mbt.insert(3);
       mbt.insert(19);
       mbt.insert(37);
       mbt.insert(13);
       mbt.insert(25);
       mbt.inOrder();
       mbt.preOrder();
       mbt.postOrder();
       mbt.levelOrder();
       
       mbt.deleteItem(5);
       mbt.inOrder();
       mbt.deleteItem(19);
       mbt.inOrder();
       mbt.deleteItem(25);
       mbt.inOrder();  
       mbt.search(5);
    }
    
}
