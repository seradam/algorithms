package PA;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

    private Node root;
    private Node[] arr;

    public BinaryTree(int arrayLength){
        this.arr = new Node[arrayLength];
        for(int i = 0; i<100;i++){
            this.arr[i] = new Node(i+1);
        }
        this.root = arr[0];
        this.buildConnections();
    }

    public void buildConnections(){
        for (int i = 0;i<this.arr.length;i++){
            if(2*i+1 < this.arr.length){
                arr[i].leftChild = arr[2*i+1];
            }
            if(2*i+2 < this.arr.length){
                arr[i].rightChild = arr[2*i+2];
            }
        }
    }

    public List<Node> pathFinder(int targetNumber){

        List<Node> path= new ArrayList<Node>();

        if(targetNumber<this.arr[0].data || targetNumber>this.arr[this.arr.length-1].data){
            System.out.println("This number is not in the tree");
            return path;
        }

        int level = 0;
        while (!(targetNumber >= Math.pow(2, level) && targetNumber < Math.pow(2, level+1))){
            level++;
        }

        int counter = (int) Math.pow(2, level);
        int start = (int) Math.pow(2, level);
        int end = (int) Math.pow(2, level+1);
        Node actual = root;
        path.add(actual);
        while (counter>1){
            if(targetNumber < (start + end)/2){
                end = (start + end)/2;
                actual = actual.leftChild;
                path.add(actual);
            }else{
                start = (start + end)/2;
                actual = actual.rightChild;
                path.add(actual);
            }
            counter/=2;
        }

        for (Node node: path) {
            System.out.println(node.data);
        }

        return path;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(100);
        bt.pathFinder(42);
    }
}
