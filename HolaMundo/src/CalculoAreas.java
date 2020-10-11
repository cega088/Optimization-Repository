import java.util.*;
import javax.swing.*;
public class CalculoAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Introduzca la figura geométrica");
Scanner EntradaFigura = new Scanner(System.in);
String Figura = EntradaFigura.nextLine();
switch(Figura) {
case "triangulo":
	String Base = JOptionPane.showInputDialog("introduzca la base");
    String Altura = JOptionPane.showInputDialog("introduzca la altura");
    int NumeroBase = Integer.parseInt(Base);
    int NumeroAltura = Integer.parseInt(Altura);
    System.out.println("El area del triangulo es "+(NumeroBase*NumeroAltura/2));
    break;
case "cuadrado":
	String Lado = JOptionPane.showInputDialog("introduzca el lado");
    int NumeroLado = Integer.parseInt(Lado);
    System.out.println("El area del cuadrado es "+(NumeroLado*NumeroLado));
    break;
case "circulo":
	System.out.println(Figura);
	String Diametro = JOptionPane.showInputDialog("introduzca el diámetro");
    int NumeroDiametro = Integer.parseInt(Diametro);
    System.out.println("El area del circulo es "+ (Math.PI*(NumeroDiametro*NumeroDiametro)/4));
    break;
 
}
	}

}
