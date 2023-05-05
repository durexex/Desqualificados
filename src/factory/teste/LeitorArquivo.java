package factory.teste;

import factory.dominio.Leitor;
import factory.dominio.LeitorFactory;
import factory.dominio.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class LeitorArquivo {

    public static void main(String[] args) {
        Pessoa pessoa;

        try {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o nome do arquivo:");

            String nomeArquivo = teclado.nextLine();
            nomeArquivo = "/c://temp/" + nomeArquivo + ".txt";

            LeitorFactory leitorFactory = new LeitorFactory();
            Leitor leitor = leitorFactory.getLeitor(nomeArquivo);

            pessoa = leitor.carregarDados();

            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getEndereco());
            System.out.println(pessoa.getIdade());
            System.out.println(pessoa.getCidade());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}

/*
    private static void ler() {
        File dir = new File("C:\\Arquivos");
        File arq = new File(dir, "LocadoraCarro.txt");

        try {
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";
            while ( ( linha = bufferedReader.readLine() ) != null) {
                System.out.println(linha);
            }

            fileReader.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
*/