package SF.Collection.Task1224;

import java.util.Deque;
import java.util.Queue;
public class Boss {
    private Deque toDoDeque;// у босса тоже есть ссылка на очередь из заданий
    public Boss(Deque toDoDeque) {
        this.toDoDeque = toDoDeque;// даем ссылку на очередь в конструкторе
    }
    public void giveTask(String task) {
        toDoDeque.add(task); // кладем задание в очередь
        System.out.println("Дал задачу " + task);
    }
}