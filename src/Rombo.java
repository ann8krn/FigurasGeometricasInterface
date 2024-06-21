
public class Rombo implements FiguraGeometrica {
	private String nombre;
	private double dm;
	private double dmy;
	private double lado;
	public Rombo(String nombre, double dm, double dmy, double lado) {
		this.nombre = nombre;
		this.dm = dm;
		this.dmy = dmy;
		this.lado = lado;
	}//constructor
	public double calcularArea() {
		return (dm*dmy)/2;
	}
	public double calcularPerimetro() {
		return (4*lado);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDm() {
		return dm;
	}
	public void setDm(double dm) {
		this.dm = dm;
	}
	public double getDmy() {
		return dmy;
	}
	public void setDmy(double dmy) {
		this.dmy = dmy;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", dm=" + dm + ", dmy=" + dmy + ", lado=" + lado + "]";
	}
	
	

	
	

}
