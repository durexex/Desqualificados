package factory.dominio;

public class Pessoa {

    private String nome;
    private String idade;
    private String cidade;
    private String endereco;

    public Pessoa(String nome, String idade, String cidade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void imprimirDados() {
        System.out.println(nome);
        if (!idade.equals("")) {
            System.out.println(idade);
        }
        if (!cidade.equals("")) {
            System.out.println(cidade);
        }
        if (endereco.equals("")) {
            System.out.println(endereco);
        }
    }
}
