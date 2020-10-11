package poo;

public class coche {
	
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String color;
	
	public coche() {
		largo=2000;
		ancho=1000;
		motor=1800;
		peso=1500;
	}
	
	public String especificaciones() {//método getter
		return "Las especificaciones de este coche son: largo: "+largo+" , ancho: "+ancho+" , motor: "+motor+" , peso: "+peso;
	}

	public void CambiarColor(String color) {//método setter
		
		this.color=color;
	}
	
	public String ImprimirColor() { //método getter
		
		return color;
	}
}
