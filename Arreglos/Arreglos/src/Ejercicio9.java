import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		int tamaño = Integer.parseInt((JOptionPane.showInputDialog("Ingrese el tamaño del arrglo: ")));
		int array1[] = new int[tamaño];
		int array2[] = new int[tamaño];
		int array3[] = new int[tamaño];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores en el array 1, posicion: " + (i + 1)));
			array2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valores en el array 2, posicion: " + (i + 1)));
			
			array3[i] = array1[i] * array2[i];
			System.out.println("El resultado de la suma de: " + array1[i] + + array2[i] +  + array3[i]);
		}
	}

}
