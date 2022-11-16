import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String[] args) {
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del arreglo: "));
		int array[] =new int[tamaño];
		int controlador = 0;
		for (int i = 0; i < array.length; i++) {
			array[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores en la posicion: " + (i + 1)));
			controlador ++;
			if(array[i] != array[controlador]) {
				System.out.println("se repite");
			}
		}
	}
}