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
        System.out.println(" \n A tarefa "+ x.getTitulo().toUpperCase() + " foi adicionada");
    }

    public void listarTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("\n A lista de tarefas está vazia.");
            return;
        }

        System.out.println("\n ==== SUAS TAREFAS ====");
        for(int i = 0 ; i < tarefas.size() ; i++){

            Tarefa t = tarefas.get(i);

            System.out.println((i + 1) + ". ");
            t.detalharTarefa();
        }
        System.out.println("========================");

    }

    public void listarPorPrioridade(Prioridade prioridadeDesejada){
        boolean encontrou = false;
        System.out.println("\n ==== TAREFAS " + prioridadeDesejada + " PRIORIDADE ====");

        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);

            // verifica se a tarefa é prioritária
            if (t instanceof TarefaPrioritaria) {
                // converte temporariamente para TarefaPrioritaria
                // para conseguir acessar o metodo getPrioridade()
                TarefaPrioritaria tp = (TarefaPrioritaria) t;

                if (tp.getPrioridade() == prioridadeDesejada) {
                    System.out.println((i + 1) + ". ");
                    tp.detalharTarefa();
                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("\n Nenhuma tarefa com prioridade " + prioridadeDesejada + " encontrada.");
        }
        System.out.println("============================");

    }

    public void concluirTarefa(int numeroEscolhido){

        int indice = numeroEscolhido - 1;

        if (indice >= 0 && indice < tarefas.size()) {
            Tarefa t = tarefas.get(indice);
            t.setConcluida(true);
            System.out.println("\n A tarefa " + t.getTitulo().toUpperCase() + " foi concluída!");
        } else {
            System.out.println("\n Número inválido!");
        }

    }

    public void removerTarefa(int indiceRemover){
        int indice = indiceRemover - 1;

        if(indice >= 0 && indice < tarefas.size()){
            Tarefa t = tarefas.get(indice);
            System.out.println("\n A tarefa " + t.getTitulo() + " foi removida");
            tarefas.remove(indice);
        } else {
            System.out.println("\n Número inválido!");
        }
    }


}
