package SF.Collection.Task1223;

import java.util.Deque;
import java.util.Queue;

import java.util.Queue;

public class Worker {
    private Deque toDoDeque;
    private Deque toDoQueue; // у рабочего есть ссылка на очередь из заданий
    public Worker(Deque toDoDeque) {
        this.toDoDeque = toDoDeque; // даем ссылку на очередь в конструкторе
    }
    public void takeTask() {
        Object task = toDoDeque.pollLast(); // вынимаем задание из очереди
        if (task != null) {
            System.out.println("Выполняю задачу: " + task);
        } else {
            System.out.println("Нет работы! Можно идти домой");
        }
    }
}


