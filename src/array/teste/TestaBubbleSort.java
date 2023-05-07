package array.teste;

import array.dominio.BubbleSort;

public class TestaBubbleSort {

	public static void main(String[] args) {
		
		int[] array = {64, 34, 25, 12, 22, 11, 90};
		
		BubbleSort bubble = new BubbleSort(array);
		bubble.executar();
		bubble.mostrarResultado();

	}

}
