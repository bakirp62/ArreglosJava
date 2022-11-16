import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		double notas[] = new double[3];
		double promedio = 0;
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota: " + (i +1)));
			promedio = notas[i] + promedio;
		}
		promedio = promedio / 3;
		System.out.println("El promedio de las notas es: " + promedio);
	}

}
