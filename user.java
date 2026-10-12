import java.util.ArrayDeque;
import java.util.Queue;

public class user {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println( AddAtIndex(q,3,35));
        System.out.println(PeekAtIndex(q,2));
        System.out.println(q);
        System.out.println(RemoveAtIndex(q,3));
    }
    private static   Queue<Integer> AddAtIndex(Queue<Integer> q,int idx,int val)
    {
        //simple logic
        //remove add idx no of values
        //add the value
        // remove add remaining values
        if(idx>q.size() || idx<0)
        {
            System.out.println("invalid index");
            return q;
        }


        int size=q.size();
        if(size==idx){
            q.add(val);
            return q;
        }
        for (int i=0;i<idx;i++)
        {
     q.add(q.remove());
        }
        q.add(val);
        for (int i=0;i<size-idx;i++)
        {
            q.add(q.remove());
        }
        return q;
    }
    private static int PeekAtIndex(Queue<Integer> q,int idx){
if (idx>q.size() || idx<0){
    System.out.println("invalid index");
    return -1;
}
        for (int i=0;i<idx;i++)
        {
            q.add(q.remove());
        }
        int peek =q.peek();
        for(int i=0;i<q.size()-idx;i++)
        {
            q.add(q.remove());
        }
        return peek;
    }
    private static Queue<Integer> RemoveAtIndex(Queue<Integer> q,int idx){
        if (idx>q.size() || idx<0){
            System.out.println("invalid index");
            return q;
        }
        for (int i=0;i<idx;i++)
        {
            q.add(q.remove());
        }
        q.remove();
        for (int i=0;i<q.size()-idx;i++)
        {
            q.add(q.remove());
        }
        return q;
    }

}
