import java.util.*;
public class Loops2 {
	public static void main(String args[]) {
		System.out.println("introduzca un n�mero entre 1 y 100");
		int Numero = (int)(Math.random()*100);
		Scanner NumeroIntroducido = new Scanner(System.in);
		int EnteroIntroducido = 0;
		int intentos=0;
		/*while (Numero!=EnteroIntroducido) {
			intentos++;
			EnteroIntroducido = NumeroIntroducido.nextInt();
			if (EnteroIntroducido>Numero) {
				System.out.println("El n�mero es m�s peque�o");
			}
			else if (EnteroIntroducido<Numero) {
				System.out.println("El n�mero es m�s grande");
			}
		}*/
		// con do while permitir�a que entrar al while por primera vez sin evaluar la condici�n
		 do{
			intentos++;
			EnteroIntroducido = NumeroIntroducido.nextInt();
			if (EnteroIntroducido>Numero) {
				System.out.println("El n�mero es m�s peque�o");
			}
			else if (EnteroIntroducido<Numero) {
				System.out.println("El n�mero es m�s grande");
			}
		}while (Numero!=EnteroIntroducido);
		
		System.out.println("Adivinaste !!, lo has conseguido en "+intentos+" intentos");	
		}
		
	}

