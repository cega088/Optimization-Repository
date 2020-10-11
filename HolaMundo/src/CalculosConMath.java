import java.util.*; //se importa java.util para poder usar la clase Locale
public class CalculosConMath {

	public static void main(String[] args) {
	/* 5- Operaciones con la clase Math */
      double a =4,b=2;
      float c=5.85F;//el sufijo F indica que es un float
      double d=5.85;
		double raiz = Math.sqrt(a);
        //System.out.print(raiz);
        double potencia = Math.pow(a, b);
        //System.out.print(potencia);
        int redondeo = Math.round(c);
        //System.out.print(redondeo);
        int redondeo2 =(int)Math.round(d); //se usa prefijo (int) para convertir de long a int (hacer una refundición)
        //System.out.print(redondeo2);
        
     /* 6- Operaciones con la clase String */   
        String MiNombre = "Camilo"; //MiNombre sería un objeto de clase String, lo que se esta haciendo en esta línea se llama instanciar
        //System.out.print(MiNombre.length()); // El método Lenght devuelve el largo de la cadena de texto
        //System.out.print(MiNombre.charAt(2));// El método charAt devuelve el carácter que se encuentre en el espacio especificado, comienza a contar desde 0
        String Nombre1,Nombre2;
        Nombre1 = "Camilo";
        Nombre2= "Camilo";
        //System.out.print(Nombre1.equals(Nombre2)); //El método equals revisa si las cadenas son iguales y debuelve un boolean
        String frase = "Hola mundo";
        System.out.print(frase.substring(0, 4));//el segundo parámetro es lo que ya no quiero extraer
     
     /* 7- Paquetes */
        //En java las clases que vienen por defecto se organizan en paquetes
        //Las clases más comunes están contenidos en el paquete java.lang
        //Si se requiere usar una clase de un paquete que no sea el principal debe importarse el paquete
        Locale variable;
	}

}
