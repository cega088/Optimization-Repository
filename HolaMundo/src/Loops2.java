import java.util.*;
public class Loops2 {
	public static void main(String args[]) {
		System.out.println("introduzca un número entre 1 y 100");
		int Numero = (int)(Math.random()*100);
		Scanner NumeroIntroducido = new Scanner(System.in);
		int EnteroIntroducido = 0;
		int intentos=0;
		/*while (Numero!=EnteroIntroducido) {
			intentos++;
			EnteroIntroducido = NumeroIntroducido.nextInt();
			if (EnteroIntroducido>Numero) {
				System.out.println("El número es más pequeño");
			}
			else if (EnteroIntroducido<Numero) {
				System.out.println("El número es más grande");
			}
		}*/
		// con do while permitiría que entrar al while por primera vez sin evaluar la condición
		 do{
			intentos++;
			EnteroIntroducido = NumeroIntroducido.nextInt();
			if (EnteroIntroducido>Numero) {
				System.out.println("El número es más pequeño");
			}
			else if (EnteroIntroducido<Numero) {
				System.out.println("El número es más grande");
			}
		}while (Numero!=EnteroIntroducido);
		
		System.out.println("Adivinaste !!, lo has conseguido en "+intentos+" intentos");	
		}
		
	}

