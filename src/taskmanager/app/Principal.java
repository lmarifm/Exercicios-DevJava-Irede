package taskmanager.app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import taskmanager.controller.TaskManager;
import taskmanager.model.Prioridade;
import taskmanager.model.TarefaPrioritaria;


public class Principal {
    static Scanner leitor = new Scanner(System.in);
    public static void main(String[] args){

        TaskManager manager = new TaskManager();
        int opcao = -1;

        do {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Filtrar por prioridade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); // limpa o buffer do teclado

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            switch (opcao) {
                case 1:
                    System.out.println("--- Nova Tarefa ---");
                    System.out.print("Título: ");
                    String titulo = leitor.nextLine();

                    System.out.print("Descrição: ");
                    String desc = leitor.nextLine();

                    System.out.print("Data Limite (dd/mm/aaaa): ");
                    String dataTexto = leitor.nextLine();
                    LocalDate data = LocalDate.parse(dataTexto, fmt); // conversao da String para LocalDate

                    System.out.println("Qual a prioridade da tarefa?");
                    System.out.println("(1-ALTA, 2-MÉDIA, 3-BAIXA): ");
                    int pOpcao = leitor.nextInt();

                    Prioridade prio = (pOpcao == 1) ? Prioridade.ALTA : (pOpcao == 2) ? Prioridade.MEDIA : Prioridade.BAIXA;

                        TarefaPrioritaria tp = new TarefaPrioritaria(titulo, desc, data, prio);
                        manager.adicionarTarefa(tp);

                    break;

                case 2:
                    manager.listarTarefas();
                    break;

                case 3:
                    manager.listarTarefas();
                    System.out.println("Digite o número da tarefa a concluir: ");
                    int numConcluir = leitor.nextInt();
                    manager.concluirTarefa(numConcluir);
                    break;

                case 4:
                    manager.listarTarefas();
                    System.out.print("Digite o número da tarefa a remover: ");
                    int numRemover = leitor.nextInt();
                    manager.removerTarefa(numRemover);
                    break;

                case 5:
                    System.out.println("== ESCOLHA UMA OPÇÃO ==");
                    System.out.println("1. ALTA ");
                    System.out.println("2. MÉDIA ");
                    System.out.println("3. BAIXA ");

                    int escolhaPrio = leitor.nextInt();
                    leitor.nextLine();

                    Prioridade p = null;

                    if (escolhaPrio == 1) {
                        p = Prioridade.ALTA;
                    } else if (escolhaPrio == 2) {
                        p = Prioridade.MEDIA;
                    } else if (escolhaPrio == 3) {
                        p = Prioridade.BAIXA;
                    }

                    if (p != null) {
                        manager.listarPorPrioridade(p);
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
