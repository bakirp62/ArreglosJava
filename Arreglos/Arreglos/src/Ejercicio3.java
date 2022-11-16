import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de notas: "));
		double notas[] = new double[tamaño];
		double promedio = 0;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota" + (i + 1)));
			promedio = promedio + notas[i];
		}
		promedio = promedio / tamaño;
		System.out.println("El promedio de las notas es: " + promedio);
	}

}
