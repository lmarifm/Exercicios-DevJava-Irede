package taskmanager.controller;

import taskmanager.model.Tarefa;
import taskmanager.model.Prioridade;
import taskmanager.model.TarefaPrioritaria;
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

    public void listarPorPrioridade(Prioridade prioridadeDesejada){
        boolean encontrou = false;
        System.out.println(" ==== TAREFAS " + prioridadeDesejada + " ====");

        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);

            // verifica se a tarefa é prioritária
            if (t instanceof TarefaPrioritaria) {
                // converte temporariamente para TarefaPrioritaria
                // para conseguir acessar o metodo getPrioridade()
                TarefaPrioritaria tp = (TarefaPrioritaria) t;

                if (tp.getPrioridade() == prioridadeDesejada) {
                    System.out.println((i + 1) + ". " + tp.getTitulo());
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma tarefa com prioridade " + prioridadeDesejada + " encontrada.");
        }
        System.out.println("============================");

    }

    public void concluirTarefa(int numeroEscolhido){

        int indice = numeroEscolhido - 1;

        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa t = tarefas.get(indice);
            t.setConcluida(true);
            System.out.println("A tarefa '" + t.getTitulo() + "' foi concluída!");
        } else {
            System.out.println("Número inválido!");
        }

    }

    public void removerTarefa(int indiceRemover){
        int indice = indiceRemover - 1;

        if(indice >= 0 && indice < tarefas.size()){
            Tarefa t = tarefas.get(indice);
            System.out.println("A tarefa " + t.getTitulo() + " foi removida");
            tarefas.remove(indice);
        } else {
            System.out.println("Número inválido!");
        }
    }


}
