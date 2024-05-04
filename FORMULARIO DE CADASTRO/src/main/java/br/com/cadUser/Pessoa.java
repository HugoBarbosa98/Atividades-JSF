package br.com.cadUser;





import java.util.ArrayList;
import java.util.List;


   public class Pessoa {
    private String nome;
    private List<String> nomes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getNomes() {
        return nomes;
    }

    public void adicionarNome() {
        if (nome != null && !nome.isEmpty()) {
            nomes.add(nome);
            // Limpar o campo após adicionar
            nome = "";
        }
    }
}


