import javax.swing.*;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Pass = "Juan";
		String Contrase�a = JOptionPane.showInputDialog("Introduzca la contrase�a);");
		while (Pass.equals(Contrase�a)==false) {
			System.out.println("Contrase�a Incorrecta");
			Contrase�a = JOptionPane.showInputDialog("Introduzca la contrase�a);");
		}
		System.out.println("Contrase�a Correcta");
	}

}
