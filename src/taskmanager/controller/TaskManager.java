package taskmanager.controller;

import taskmanager.model.Tarefa;
import taskmanager.model.Prioridade;
import java.util.ArrayList;
import java.util.List;


public class TaskManager {

    private List<Tarefa> tarefas;

    public TaskManager() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa x){
        tarefas.add(x);
        System.out.println(" A tarefa "+ x + "foi adicionada");
    }

    public void listarTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
            return;
        }

        System.out.println(" ==== SUAS TAREFAS ====");
        for(int i = 0 ; i < tarefas.size() ; i++){

            String titulo = tarefas.get(i).getTitulo();

            System.out.println((i + 1) + ". " + titulo);
        }
        System.out.println("========================");

    }

    public void listarPorPrioridade()

}
