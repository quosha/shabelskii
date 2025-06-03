import java.util.LinkedList;
public class NewClass
{
    public static LinkedList<Integer> queueInit() {
        return new LinkedList<>();
    }
    public static void queueEnqueue(LinkedList<Integer> queue, int item){
        queue.add(item);
    }
    public static Integer queueDequeue(LinkedList<Integer> queue){
        if (queueIsEmpty(queue)){
            System.out.println("Очередь пуста");
            return null;
        }
        return queue.poll();
    }
    public static boolean queueIsEmpty(LinkedList<Integer> queue){
        return queue.isEmpty();
    }
    public static void main(String[] args){
        LinkedList<Integer> queue = queueInit();
        
        queueEnqueue(queue, 1);
        queueEnqueue(queue, 2);
        queueEnqueue(queue, 3);
        
        System.out.println(queueDequeue(queue));
        System.out.println(queueDequeue(queue));
        System.out.println(queueDequeue(queue));
    }
}
        