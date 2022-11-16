import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de repeticiones"));
		int array[] = new int[tamaño];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero en la posición: " + (i + 1)));
		}
		
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero que desea buscar: "));
		
		for (int i = 0; i < array.length; i++) {
			if (buscar == array[i]) {
				System.out.println(array[i]);
			}
		}
	}

}
