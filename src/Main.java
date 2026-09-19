import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TodoList todo = new TodoList();
        int op;

        do {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1 - Add task");
            System.out.println("2 - List tasks");
            System.out.println("3 - Complete task");
            System.out.println("4 - Remove task");
            System.out.println("0 - Exit");
            System.out.print("Option: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.print("Description: ");
                    String desc = sc.nextLine();
                    todo.addTask(desc);
                }
                case 2 -> todo.listTasks();
                case 3 -> {
                    System.out.print("ID to complete: ");
                    int id = sc.nextInt();
                    todo.completeTask(id);
                }
                case 4 -> {
                    System.out.print("ID to remove: ");
                    int id = sc.nextInt();
                    todo.removeTask(id);
                }
                case 0 -> System.out.println("Bye!");
                default -> System.out.println("Invalid option!");
            }
        } while (op != 0);
        sc.close();
    }
}