
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] NumerosAleatorios = new int[5];
		for(int i=0;i<NumerosAleatorios.length;i++) {
		NumerosAleatorios[i] = (int) (Math.random()*100);
		}
		for(int Elemento:NumerosAleatorios) { //Estructura for each
			System.out.println(Elemento);
		}
}
}
