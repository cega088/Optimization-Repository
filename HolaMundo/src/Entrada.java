import java.util.*;
public class Entrada {
	public static void main(String[] args) {
		
		//Las clases adem�s de m�todos(propiedades) tienen constructores que sirven para inicializar un objeto de esa clase de una forma u otra
	Scanner Entrada = new Scanner(System.in); // es la forma de inicializar un objeto de tipo scanner llamado "Entrada" con el constructor m�s sencillo, el par�metro pasado al constructor es una entrada por consola. 
    System.out.println("introduce tu nombre");
    String NombreUsuario = Entrada.nextLine();
    System.out.println("introduce tu edad");  
    int Edad = Entrada.nextInt();
    System.out.println("Hola "+NombreUsuario+". El a�o que viene tendr�s "+(Edad+1)+" a�os");  
    
    if(Edad<18) {
    	
    	System.out.println("ud es un pelao");
    }
    else if(Edad>=18 && Edad<40) {
    	System.out.println("ud es un adulto");
    }
    else{
    	System.out.println("ud es un abuelo");
    }
    
    
    
	}
	}
