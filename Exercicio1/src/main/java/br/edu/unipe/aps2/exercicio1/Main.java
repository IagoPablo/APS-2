package br.edu.unipe.aps2.exercicio1;

public class Main {
    public static void main(String[] args) {
        MinhaAgendaDeAniversarios agenda = new MinhaAgendaDeAniversarios();

        agenda.adicionarAniversariante("Maria", 10, 5);
        agenda.adicionarAniversariante("João", 10, 5);
        agenda.adicionarAniversariante("Ana", 25, 12);

        System.out.println("Aniversariantes em 10/5: " + agenda.obterAniversariantesDoDia(10, 5));

        agenda.removerAniversariante("João");

        System.out.println("Após remover João: " + agenda.obterAniversariantesDoDia(10, 5));
    }
}
