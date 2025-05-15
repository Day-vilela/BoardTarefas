package controller;

import model.Status;
import model.Task;
import service.TaskService;

import java.util.List;

public class TaskController {
    private final TaskService service = new TaskService();

    public Task criar(String titulo, String descricao) {
        return service.criarTarefa(titulo, descricao);
    }

    public List<Task> listar() {
        return service.listarTarefas();
    }

    public boolean atualizar(int id, Status status) {
        return service.atualizarStatus(id, status);
    }

    public boolean remover(int id) {
        return service.removerTarefa(id);
    }
}
