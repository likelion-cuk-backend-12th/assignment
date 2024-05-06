package java2.ex05;

public class LikeStack {

    public LikeList list = new LikeList();
    public static int num = 0;

    public void push(int value){
        list.insert(num, value);
        num++;
    }

    public void pop(){
        if(!isEmpty()){
            list.delete(num-1);
            num--;
        }
    }

    public int peek(){
        return list.node(num-1).data;

    }

    public boolean isEmpty(){
        if(num == 0)
            return true;
        else return false;
    }
}
