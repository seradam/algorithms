package Stack;

public class Stackll {

    private Node top=null;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int x){
        if(isEmpty()) {
            top= new Node(x);
        }else{
            Node p=new Node(x);
            p.next=top;
            top=p;
        }
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }else{
            int x=top.data;
            top=top.next;
            return x;
        }
    }

    public void printAll(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            Node current=top;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }

    public static void main(String[] args) {
        Stackll myStack = new Stackll();
        System.out.println("My actual stack: ");
        myStack.printAll();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("My actual stack:");
        myStack.printAll();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
