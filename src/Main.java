
public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo ("Bermudas", 10, 10, 15);
		Triangulo t = new  Triangulo ("TriánguloTE", 250, 175, 145);
		Cuadrado u = new Cuadrado ("CuadradoTE", 100);
		Rectangulo m = new Rectangulo ("Rec Angulo", 20, 35);
		Rombo o = new Rombo ("Rombo", 15, 30, 40);
		Romboide e = new Romboide ("Romboide", 15, 20);
		Trapecio s = new Trapecio ("TrapecioS", 9, 7, 12, 7, 9, 12, 6);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(u);
		imprimirCalculo(m);
		imprimirCalculo(o);
		imprimirCalculo(e);
		imprimirCalculo(s);
	}//main
	public static void imprimirCalculo(FiguraGeometrica f) {
		System.out.println(f.toString());
		System.out.println("+===============");
		System.out.println("| El área de [" + f.getNombre()
		+ "] es : " +  f.calcularArea());
		System.out.println("| El perímetro de [" + f.getNombre()
		+ "] es : " +  f.calcularPerimetro());
		System.out.println("+===============");	
		
	}//imprimir Calculo

}//class main
