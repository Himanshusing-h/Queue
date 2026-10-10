import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basics {
    public static void main(String[] args) {
         Queue<Integer> q=new LinkedList<>();
         //or
       // Queue<Integer> q=new ArrayDeque<>();
        q.add(0);
        q.add(45);

        System.out.println(q);//nakli printing
        System.out.println(q.peek());
        q.remove();
        System.out.println(q+" "+q.size());




    }
}
