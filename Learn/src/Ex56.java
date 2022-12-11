import java.util.PriorityQueue;

// Напишите Java-программу для создания новой очереди приоритетов,
// добавьте несколько цветов (строку) и распечатайте элементы очереди приоритетов.
public class Ex56 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Green");
        priorityQueue.add("Black");
        priorityQueue.add("White");
        priorityQueue.add("Blue");
        System.out.println(priorityQueue);
    }
}