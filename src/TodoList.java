import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void addTask(String desc) {
        tasks.add(new Task(nextId++, desc));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet!");
            return;
        }
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setDone(true);
                System.out.println("Task completed!");
                return;
            }
        }
        System.out.println("Task not found!");
    }

    public void removeTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
        System.out.println("Task removed!");
    }
}