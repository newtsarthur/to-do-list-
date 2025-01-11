package taskmanager.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    public void createTask(Scanner scanner) {
        System.out.print("Digite a descrição da tarefa: ");
        String description = scanner.nextLine();
        Task task = new Task(nextId++, description);
        tasks.add(task);
        System.out.println("Tarefa concluída com sucesso!");
    }

    public void listTasks() {
        if(tasks.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            System.out.println("\n --- Lista de tarefas ---");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }


}
