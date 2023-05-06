package lacoFor.teste;

import lacoFor.dominio.Tabuada;

import java.util.Scanner;

public class testeTabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o multiplicador:");

        int multiplicador = teclado.nextInt();
        Tabuada tabuada = new Tabuada(multiplicador); // instanciando tabuada

        System.out.println(" ** Tabuada do: " + tabuada.getValor() + " ** ");
        tabuada.calcular();
        teclado.close();

        System.out.println(" \n ** Desqualificados Softwares ** ");

    }
}
