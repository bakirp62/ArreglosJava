import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros : "));
		int[] array = new int[tamaño];
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor en la posicion: " + (i + 1)));
			if (array[i] > -1 && array[i] < 11) {
				suma = suma + array[i];

			} else {
				System.out.println("es invalido");
				array[i] = Integer.parseInt(JOptionPane.showInputDialog("Tiene que ser un numero positivo y menor o igual a10.\n Ingrese otro valor en la posicion: " + (i + 1)));
				break;
			}
		}
		System.out.println("la suma total de los numeros registrados es de: " + suma);
	}

}
