import javax.swing.*;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Pass = "Juan";
		String Contraseņa = JOptionPane.showInputDialog("Introduzca la contraseņa);");
		while (Pass.equals(Contraseņa)==false) {
			System.out.println("Contraseņa Incorrecta");
			Contraseņa = JOptionPane.showInputDialog("Introduzca la contraseņa);");
		}
		System.out.println("Contraseņa Correcta");
	}

}
