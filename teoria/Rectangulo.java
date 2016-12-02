public class Rectangulo {
	//atributos
	private int lado1 = 12;
	private int lado2 = 19;
	
	//getters  OBTIENES	
	public int getLado1(){
		return this.lado1;
	}
	public int getLado2(){
		return this.lado2;
	}
	//setters INSERTA
	public void setLado1(int lado1){
		this.lado1 = lado1;
	}
	public void setLado2(int lado2){
		this.lado2 = lado2;
	}
	//método que devuelve el valor de área
	public int getArea(){
		return this.lado1 * this.lado2;
	}
}
