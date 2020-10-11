
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] Matrix = new double[6][5];
		
		double[] Percent = {1.1,1.11,1.12,1.13,1.14,1.15};
		
		for(int i=0;i<6;i++) {
			Matrix[i][0]=10000;
			for(int j=1;j<5;j++) {
				Matrix[i][j]= Matrix [i][j-1]*Percent[i];
			}
		}
		
		for(double[] Fila:Matrix) {
			System.out.println();
			for(double Elemento:Fila) {
				System.out.print((int)Elemento + " ");
			}
		}

	}

}
