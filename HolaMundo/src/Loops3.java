import javax.swing.JOptionPane;

public class Loops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int NumeroArrobas=0;
		boolean punto = false;
		String Correo = JOptionPane.showInputDialog("Introduzca su correo electr�nico");
		for(int i=0;i<Correo.length();i++){
			if(Correo.charAt(i)=='@') {
				NumeroArrobas++;
			}
			if(Correo.charAt(i)=='.'){
				punto=true;
			}
		}
		if(NumeroArrobas==1 && punto==true) {
			System.out.println("Direcci�n de correo electr�nico v�lida");
		}
		else {
			System.out.println("Direcci�n de correo electr�nico inv�lida");
		}
	}
*/
		int Resultado=1;
		int Numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un n�mero"));
		
		for(int i=1;i<Numero+1;i++) {
			
			Resultado = Resultado*i;
			
		}
		System.out.println(Resultado);
	}
}
