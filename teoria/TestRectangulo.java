public class TestRectangulo{
	public static void main (String[] arg){
		//creamos objetos de tipo Rectangulo
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		//System.out.println(r1.lado1); No tiene accesibilidad
		//System.out.println(r2.lado2); Lado1 y 2 son atributos privates
		//cambiamos los valores por defecto del rectangulo r2
		r2.setLado1(100); //actualizo los valores del atributo lado1
		r2.setLado2(1000); //actualizo los valores del atribto lado2
			System.out.printf("Atributos del rectángulo1, lado1: %d; lado2: %d y de area %d%n", r1.getLado1(), r1.getLado2(), r1.getArea());
			System.out.printf("Atributos del rectángulo2, lado1: %d; lado2: %d y de area %d%n", r2.getLado1(), r2.getLado2(), r2.getArea());
	}
 }
