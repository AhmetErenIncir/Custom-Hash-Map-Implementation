public class  BinaryTree<T extends Comparable<T>> {

    private Node<T> root ;
    private int size;

    static class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
        T data;
        Node<T> right;
        Node<T> left;



        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        @Override
        public int compareTo(Node<T> o) {
            return this.data.compareTo(o.getData());
        }


    }


    public int getSize() {
        return size;
    }

    public void insert(T data){

        root = insert(root,data);
        size++;
    }

    public Node<T> getRoot() {
        return root;
    }

    private  Node<T> insert(Node<T> currentNode, T data){

        if(currentNode == null ){
            currentNode = new Node<>();
            currentNode.setData(data);
            return currentNode;
        }

        if(data.compareTo(currentNode.getData())<0){
            currentNode.left = insert(currentNode.left,data);
        }
        else if(data.compareTo(currentNode.getData())>0){
            currentNode.right =  insert(currentNode.right,data);
        }
        return currentNode;
    }


    public void print(Node<T> node){
        if(node != null){
            print(node.left);
            System.out.println(node.getData());
            print(node.right);
        }
    }

    public boolean contains( T val )
    {
        return contains(root, val);
    }



    private boolean contains(Node<T> root, T val)
    {
        int comp = val.compareTo( root.getData() );

        if(comp == 0)
        {
            return true;
        }
        if(comp < 0 && root.getLeft() !=null)
        {
            return contains(root.getLeft(), val);
        }
        if(comp > 0 && root.getRight() != null)
        {
            return contains(root.getRight(), val);
        }
        return false;
    }

    public boolean searchKey(T key ){
        return searchKey(root,key );
    }

    private boolean searchKey(Node<T> root, T key ){

        if(root == null){
            return false;
        }

        int comp = key.compareTo( root.getData() );

        if(comp == 0)
        {
            root.setData(key);
            return true;
        }
        if(comp < 0 && root.getLeft() !=null)
        {
            return contains(root.getLeft(), key);
        }
        if(comp > 0 && root.getRight() != null)
        {
            return contains(root.getRight(), key);
        }
        return false;
    }

    public T getSearch(T key){
        return getSearch(root,key);
    }
    private T getSearch(Node<T> currentRoot , T key){
        if(currentRoot == null){
            return null;
        }
        int comp = key.compareTo(currentRoot.getData());

        if(comp == 0){
            return currentRoot.getData();
        }
        if(comp <0 && root.getLeft() != null){
            return getSearch(currentRoot.getLeft() , key);
        }
        if(comp>0 && root.getRight() != null){
            return getSearch(currentRoot.getRight(),key);
        }
        return null;

    }

    public T deleteSearch(T key){
        return deleteSearch(root , key);
    }

    private T deleteSearch(Node<T> current , T key){
        if(current == null){
            return null;
        }
        int comp = key.compareTo(current.getData());

        if(comp == 0){
            T temp = current.getData();
            current.setData(null);
            return temp;
        }
        if(comp <0 && root.getLeft() != null){
            return deleteSearch(current.getLeft() , key);
        }
        if(comp>0 && root.getRight() != null){
            return deleteSearch(current.getRight(),key);
        }
        return null;
    }





}
