package factory.dominio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorFactory {

    public Leitor getLeitor(String nomeArquivo) throws IOException {
        FileReader fileReader = new FileReader(nomeArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;

        linha = bufferedReader.readLine();

        if (linha.equals("01")) {
            return new LeitorTipo01(nomeArquivo);
        } else if (linha.equals("02")) {
            return new LeitorTipo02(nomeArquivo);
        } else if (linha.equals("03")) {
            return new LeitorTipo03(nomeArquivo);
        } else {
            return null;
        }
    }
}
