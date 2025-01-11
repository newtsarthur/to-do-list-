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

    public void editTask(Scanner scanner) {
        System.out.print("Digite o ID da tarefa que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Task task = findTaskById(id);

        if(task != null) {
            System.out.print("Nova descrição: ");
            String newDescription = scanner.nextLine();
            task.setDescription(newDescription);

            System.out.print("A tarefa está concluída? (s/n) : ");
            String completed = scanner.nextLine();
            task.setCompleted(completed.equalsIgnoreCase("s"));
            System.out.println("Tarefa atuliazada com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void deleteTask(Scanner scanner) {
        System.out.print("Digite o ID da tarefa que quer deletar: ");
        int id = scanner.nextInt();
        Task task = findTaskById(id);

        if(task != null) {
            tasks.remove(task);
            System.out.println("Tarefa excluída com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    private Task findTaskById(int id) {
        for (Task task : tasks) {
            if(task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
