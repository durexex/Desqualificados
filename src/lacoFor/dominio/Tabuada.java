package lacoFor.dominio;

public class Tabuada {
    private int valor;

    public Tabuada(int valor) { // multiplicador
        this.valor = valor;
    }

    public void calcular() {
        for (int x = 1; x < 11; x++) {
            System.out.println(valor + " X " + x + " = " + valor * x);
            
        }
    }

    public int getValor() {
        return valor;
    }
}
