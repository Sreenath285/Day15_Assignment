public class BinaryTreeService {

    /***
     * createNode method is to create node
     * @param data - data which we have to give as root node
     * @return root - returning root node
     */
    private MyNode createNode(int data) {

        MyNode root = new MyNode();
        root.data = data;
        root.left = null;
        root.right = null;
        return root;
    }

    /***
     * insertNode method is created to insert data
     * @param node - node is to check the data
     * @param data - inserting element into binary search tree
     * @return - returning node
     */
    public MyNode insertNode(MyNode node, int data) {

        if (node == null ) {
            return createNode(data);
        }
        if (data < node.data) {
            node.left = insertNode(node.left,data);
        }
        else if (data > node.data) {
            node.right = insertNode(node.right,data);
        }
        return node;
    }

    /***
     * preOrder method is created to print data as inserting data in binary search tree
     * @param node - node is to check the data
     */
    public void preOrder(MyNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data);
        preOrder(node.left);
        preOrder(node.right);
    }

    public int size(MyNode myNode) {

        if (myNode == null) {
            return 0;
        }
        else {
            return (size(myNode.left) + 1 + (size(myNode.right)));
        }
    }
}
