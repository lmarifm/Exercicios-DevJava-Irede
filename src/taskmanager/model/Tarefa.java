package taskmanager.model;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tarefa implements ITarefa{

    private String titulo;
    private String descricao;
    private LocalDate dataLimite;
    private boolean concluida;

    public Tarefa(String titulo, String descricao, LocalDate dataLimite) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataLimite = dataLimite;
        this.concluida = false;
    }

    @Override
    public void detalharTarefa() {
        System.out.println("Título: " + titulo);
        System.out.println("Status: " + (concluida ? "Concluída" : "Pendente"));
        System.out.println("Entrega: " + dataLimite);
    }

    //getters e setters, o atributo id so tem get pois o sistema q setara automaticamente
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(LocalDate dataLimite) {
        this.dataLimite = dataLimite;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }


}
