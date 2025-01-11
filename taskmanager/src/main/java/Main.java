package taskmanager.src.main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();
        int option;

        do {
            System.out.println("\n--- Gerenciador de Tarefas ---");
            System.out.println("1. Criar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Editar tarefa");
            System.out.println("4. Excluir tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> taskManager.createTask(scanner);
                case 2 -> taskManager.listTasks();
                case 3 -> taskManager.editTask(scanner);
                case 4 -> taskManager.deleteTask(scanner);
                case 5 -> System.out.println("Opção inválida. Programa encerrado");
            }
        } while (option != 5);

        scanner.close();
    }
}
