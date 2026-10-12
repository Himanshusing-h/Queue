import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElement {
    public static void main(String[] args) {
//reversing first k element
        //simple logic
        //remove k elements from que and add it to stack
        //add the elements fo stack to queue until stack is empty
        //remove and add n-k elements in queue
        //print queue
        Queue<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);
        System.out.println(reversek(q,2));
    }
    public static Queue<Integer> reversek(Queue<Integer> q,int k){
        Stack<Integer> stk=new Stack<>();
        for (int i=0;i<k;i++)
        {
       stk.add(q.remove());
        }
        for (int i=stk.size();i>0;i--)
        {
            q.add(stk.pop());
        }
        for (int i=0;i<q.size()-k;i++)
        {
            q.add(q.remove());
        }
        return q;

    }
    }
