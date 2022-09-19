package binarysearchtree;

public class MyBinTree {

    BNode root;

    public MyBinTree() {
        root = null;
    }

    public void insert(int data) {
        BNode newNode = new BNode(data);
        if (root == null) {
            root = newNode;
            return;
        }
        BNode parent, curr;
        parent = curr = root;
        while (curr != null) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public Integer search(int key) {
        BNode curr = root;
        while (curr != null && curr.data != key) {
            if (key < curr.data) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
        if (curr != null) {
            return curr.data;
        }
        return null;
    }

    public void inOrder() {
        recInOrder(root);
        System.out.println("");
    }

    private void recInOrder(BNode curr) {
        if (curr == null) {
            return;
        }
        recInOrder(curr.left);
        System.out.print(curr.data + " ");
        recInOrder(curr.right);
    }

    public void preOrder() {
        recPreOrder(root);
        System.out.println("");
    }

    private void recPreOrder(BNode curr) {
        if (curr == null) {
            return;
        }
        System.out.print(curr.data + " ");
        recPreOrder(curr.left);
        recPreOrder(curr.right);
    }

    public void postOrder() {
        recPostOrder(root);
        System.out.println("");
    }

    private void recPostOrder(BNode curr) {
        if (curr == null) {
            return;
        }
        recPostOrder(curr.left);
        recPostOrder(curr.right);
        System.out.print(curr.data + " ");
    }

    public void levelOrder() {
        BNode curr = null;
        MyQueue Q = new MyQueue();
        Q.enQueue(root);
        while (!Q.isEmpty()) {
            curr = Q.deQueue();
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                Q.enQueue(curr.left);
            }
            if (curr.right != null) {
                Q.enQueue(curr.right);
            }
        }
        System.out.println("");
    }

    public void deleteItem(int key) {
        root =recursiveDelete(root, key);
    }

    private BNode recursiveDelete(BNode root, int key) {
        if (root == null) {
            return null; // case 0
        }
        if (key < root.data) {
            root.left = recursiveDelete(root.left, key);
        } else if (key > root.data) {
            root.right = recursiveDelete(root.right, key);
        } else {
            // found it!!!!!!!!
            // if the node to be deleted has one child or no children
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            //case 3
            BNode succ = root.right;
            while (succ.left != null) {
                succ = succ.left;
            }
            root.data = succ.data;
            root.right = recursiveDelete(root.right, succ.data);
        }
        return root;
    }

}
