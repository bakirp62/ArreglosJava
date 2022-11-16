import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		int array[] = new int[5];
		int suma = 0;
		
		for (int index = 0; index < array.length; index++) {
			array[index] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: " + (index + 1)));
			suma = suma + array[index];
		}
		System.out.println("La suma de los numeros es: " + suma);
	}

}
