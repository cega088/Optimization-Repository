import javax.swing.*;
public class Entrada2 {

	public static void main(String[] args) {
		
    //en esta ocasi�n se har� la entrada de datos mediante la clase Joptionpane, por medio de un m�todo est�tico
	//cuando el m�todo es est�tico no es necesario instanciar ning�n objeto de la clase, el m�todo se aplica al nombre de la clase ejemplo: math.round()
		String NombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre");
		String Edad = JOptionPane.showInputDialog("Introduce tu edad");
		;
		System.out.println("Hola "+NombreUsuario+". El a�o que viene tendr�s "+(Integer.parseInt(Edad)+1)+" a�os"); //integer es una clase y parseint es un m�todo est�tico que recibe un string y devuelve un entero seg�n dicha string
		
	}

}
