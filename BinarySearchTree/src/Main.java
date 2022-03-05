public class Main {

    /***
     * main method for manipulation
     * @param args - default param(not used)
     */
    public static void main(String[] args) {

        /***
         * PROCEDURE
         * 1. creating binary tree service object
         * 2. creating my node
         * 3. inserting data to binary search tree
         * 4. printing binary search tree in preorder
         * 5. printing size of the tree
         * 6. searching element in the tree
         */

        /***
         * 1. creating binary tree service
         */
        BinaryTreeService binaryTreeService = new BinaryTreeService();

        /***
         * 2. creating my node and init to null
         */
        MyNode myNode = null;

        /***
         * 3. inserting data to binary search tree
         */
        myNode = binaryTreeService.insertNode(myNode,56);
        myNode = binaryTreeService.insertNode(myNode,30);
        myNode = binaryTreeService.insertNode(myNode,70);
        myNode = binaryTreeService.insertNode(myNode,36);
        myNode = binaryTreeService.insertNode(myNode,78);
        myNode = binaryTreeService.insertNode(myNode,64);

        /***
         * 4. printing binary search tree in preorder
         */
        binaryTreeService.preOrder(myNode);

        /***
         * 5. printing size of the tree
         */
        System.out.println("Size of the tree : " + binaryTreeService.size(myNode));

        /***
         *  6. searching element in the tree
         */
        System.out.println("Searched element is present : " + binaryTreeService.search(myNode, 64));

    }
}
