package model;

public class Task {
    private int id;
    private String titulo;
    private String descricao;
    private Status status;

    public Task(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.TODO;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getDescricao() { return descricao; }
    public Status getStatus() { return status; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return id + " - " + titulo + " [" + status + "]\n" + descricao;
    }
}
