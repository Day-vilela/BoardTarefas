package service;

import model.Status;
import model.Task;
import repository.TaskRepository;

import java.util.List;
import java.util.Optional;

public class TaskService {
    private final TaskRepository repository = new TaskRepository();

    public Task criarTarefa(String titulo, String descricao) {
        return repository.save(new Task(0, titulo, descricao));
    }

    public List<Task> listarTarefas() {
        return repository.findAll();
    }

    public boolean atualizarStatus(int id, Status status) {
        Optional<Task> task = repository.findById(id);
        if (task.isPresent()) {
            task.get().setStatus(status);
            return true;
        }
        return false;
    }

    public boolean removerTarefa(int id) {
        return repository.delete(id);
    }
}
