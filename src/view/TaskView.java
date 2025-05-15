package view;

import controller.TaskController;
import model.Status;
import model.Task;

import java.util.List;
import java.util.Scanner;

public class TaskView {
    private final TaskController controller = new TaskController();
    private final Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n== BOARD DE TAREFAS ==");
            System.out.println("1. Criar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Atualizar status");
            System.out.println("4. Remover tarefa");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1 -> criarTarefa();
                case 2 -> listarTarefas();
                case 3 -> atualizarStatus();
                case 4 -> removerTarefa();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void criarTarefa() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        Task task = controller.criar(titulo, descricao);
        System.out.println("Tarefa criada: " + task.getId());
    }

    private void listarTarefas() {
        List<Task> tarefas = controller.listar();
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            tarefas.forEach(System.out::println);
        }
    }

    private void atualizarStatus() {
        System.out.print("ID da tarefa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Novo status (TODO, DOING, DONE): ");
        String status = scanner.nextLine();
        boolean atualizado = controller.atualizar(id, Status.valueOf(status.toUpperCase()));
        System.out.println(atualizado ? "Atualizado com sucesso." : "Tarefa não encontrada.");
    }

    private void removerTarefa() {
        System.out.print("ID da tarefa: ");
        int id = scanner.nextInt();
        boolean removido = controller.remover(id);
        System.out.println(removido ? "Removida com sucesso." : "Tarefa não encontrada.");
    }
}
