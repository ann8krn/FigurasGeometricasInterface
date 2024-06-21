
public class Trapecio implements FiguraGeometrica{ 
	private String nombre;
	private double lado;
	private double lado1;
	private double lado2;
	private double lado3;
	private double bm;
	private double bmy;
	private double altura;
	public Trapecio(String nombre, double lado, double lado1, double lado2, double lado3, double bm, double bmy,
			double altura) {
		this.nombre = nombre;
		this.lado = lado;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.bm = bm;
		this.bmy = bmy;
		this.altura = altura;
	}//constructor
	public double calcularArea() {
		return altura * (bm+bmy)/2;
	}
	public double calcularPerimetro() {
		return (lado+lado1+lado2+lado3);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public double getLado3() {
		return lado3;
	}
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
	public double getBm() {
		return bm;
	}
	public void setBm(double bm) {
		this.bm = bm;
	}
	public double getBmy() {
		return bmy;
	}
	public void setBmy(double bmy) {
		this.bmy = bmy;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", lado=" + lado + ", lado1=" + lado1 + ", lado2=" + lado2 + ", lado3="
				+ lado3 + ", bm=" + bm + ", bmy=" + bmy + ", altura=" + altura + "]";
	}
	

}
