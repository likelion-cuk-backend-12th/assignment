package java2.ex06;

public class LikeQueue {
    private LikeList list = new LikeList();
    static int front = 0;
    static int rear = 0;

    public void enqueue(int value){
        list.insert(rear,value);
        rear++;
    }

    public void dequeue(){
        list.delete(front);
        front++;
    }
    public int peek(){
        return list.node(front-1).data;
    }
    public boolean isEmpty(){
        if(front == rear)
            return true;
        else return false;
    }

}
