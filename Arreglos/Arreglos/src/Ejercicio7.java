import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros a guardar"));
		int array[] = new int[tamaño];
		int auxiliar;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un elemento en la posicion: " + (i + 1)));
		}
		
		for (int i = 0; i < (tamaño - 1); i++) {
			for (int j = 0; j < (tamaño - 1); j++) {
				if(array[j] > array[j + 1]) {
					auxiliar = array[j];
					array[j] = array[j + 1];
					array[j + 1] = auxiliar;
				}
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
