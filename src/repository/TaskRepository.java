package repository;

import model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {
    private final List<Task> tasks = new ArrayList<>();
    private int idCounter = 1;

    public Task save(Task task) {
        task = new Task(idCounter++, task.getTitulo(), task.getDescricao());
        tasks.add(task);
        return task;
    }

    public List<Task> findAll() {
        return tasks;
    }

    public Optional<Task> findById(int id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst();
    }

    public boolean delete(int id) {
        return tasks.removeIf(t -> t.getId() == id);
    }
}
