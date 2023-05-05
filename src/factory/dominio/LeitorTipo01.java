package factory.dominio;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorTipo01 implements Leitor {
    private String nomeArquivo;

    public LeitorTipo01(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public Pessoa carregarDados() {
        String nome = "";
        String idade = "";
        String cidade = "";

        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha = bufferedReader.readLine();
            nome = bufferedReader.readLine();
            idade = bufferedReader.readLine();
            cidade = bufferedReader.readLine();

            fileReader.close();
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pessoa pessoa = new Pessoa(nome, idade, cidade, "");
        return pessoa;
    }

}

