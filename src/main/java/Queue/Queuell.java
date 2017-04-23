package Queue;

public class Queuell {

    private Node first =null;
    private Node last =null;

    public boolean isEmpty(){
        return first == null || last == null;
    }

    public void push(int x){
        if(isEmpty()){
            Node p = new Node(x);
            first = last =p;
        }else{
            Node p = new Node(x);
            last.next=p;
            last =p;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else{
            int x= first.data;
            first = first.next;
            return x;
        }
    }


    public void printAll(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node current=first;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public static void main(String[] args) {
        Queuell myQueue = new Queuell();
        System.out.println("My actual queue:");
        myQueue.printAll();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        System.out.println("My actual queue:");
        myQueue.printAll();
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
    }
}
