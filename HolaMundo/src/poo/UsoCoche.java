package poo;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    coche Renault = new coche();
    // Renault.peso=2000;  no deber�a de poder hacerse,la idea es que no se pueda acceder a propiedades de una clase desde otra clase
    //se soluciona antecediendo las variables con un private (esto se llama encapsulaci�n)
    //la forma correcta de acceder a las propiedades de otra clase desde una clase diferente es por medio de m�todos
    
    System.out.println(Renault.especificaciones());
    Renault.CambiarColor("azul");
    System.out.println(Renault.ImprimirColor());

	}

}
