package taskmanager.model;
import java.time.LocalDate;

public class TarefaPrioritaria extends Tarefa{

    private Prioridade nivel;

    public TarefaPrioritaria(String titulo, String descricao, LocalDate data, Prioridade nivel) {
        super(titulo, descricao, data);
        this.nivel = nivel;
    }

    @Override
    public void detalharTarefa() {
        super.detalharTarefa();
        System.out.println("Nível: " + nivel);
    }

    public Prioridade getPrioridade() {
        return nivel;
    }

    public void setNivel(Prioridade nivel) {
        this.nivel = nivel;
    }
}
