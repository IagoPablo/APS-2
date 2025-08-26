package br.edu.unipe.aps2.exercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        this.aniversariantes = new ArrayList<>();
    }

    @Override
    public void adicionarAniversariante(String nome, int dia, int mes) {
        Aniversariante novo = new Aniversariante(nome, dia, mes);
        if (!aniversariantes.contains(novo)) {
            aniversariantes.add(novo);
        }
    }

    @Override
    public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
        ArrayList<String> nomes = new ArrayList<>();
        DataAniversario data = new DataAniversario(dia, mes);
        for (Aniversariante a : aniversariantes) {
            if (a.getDataAniversario().equals(data)) {
                nomes.add(a.getNome());
            }
        }
        return nomes;
    }

    @Override
    public void removerAniversariante(String nomeAniversariante) {
        aniversariantes.removeIf(a -> a.getNome().equalsIgnoreCase(nomeAniversariante));
    }
}
