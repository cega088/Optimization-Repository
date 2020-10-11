import javax.swing.*;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Pass = "Juan";
		String Contraseña = JOptionPane.showInputDialog("Introduzca la contraseña);");
		while (Pass.equals(Contraseña)==false) {
			System.out.println("Contraseña Incorrecta");
			Contraseña = JOptionPane.showInputDialog("Introduzca la contraseña);");
		}
		System.out.println("Contraseña Correcta");
	}

}
