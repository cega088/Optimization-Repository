import javax.swing.*;
public class Entrada2 {

	public static void main(String[] args) {
		
    //en esta ocasión se hará la entrada de datos mediante la clase Joptionpane, por medio de un método estático
	//cuando el método es estático no es necesario instanciar ningún objeto de la clase, el método se aplica al nombre de la clase ejemplo: math.round()
		String NombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
		String Edad = JOptionPane.showInputDialog("Introduce tu edad");
		;
		System.out.println("Hola "+NombreUsuario+". El año que viene tendrás "+(Integer.parseInt(Edad)+1)+" años"); //integer es una clase y parseint es un método estático que recibe un string y devuelve un entero según dicha string
		
	}

}
