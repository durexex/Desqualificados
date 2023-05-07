package array.dominio;

public class BubbleSort {

	private int[] array;

	public BubbleSort(int[] valor) {
		this.array = valor;

	}

	public void executar() {
		int tamanho = array.length;
		for (int i = 0; i < tamanho - 1; i++) {
			for (int j = 0; j < tamanho - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public void mostrarResultado() {
		int tamanho = array.length;
		for (int i = 0; i < tamanho; i++) {
			System.out.println(array[i]);
		}
	}
}
