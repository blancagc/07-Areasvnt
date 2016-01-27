/**
 * 
 * @author Blanca
 *
 */
public class Areas {
	/**
	 * 
	 * @param lado tipo entero
	 * @return la multiplicacion de los lados
	 */
	public int cuadrado(int lado){
		return lado * lado;
	}
	/**
	 * 
	 * @param altura tipo entero
	 * @param base tipo entero
	 * @return la multiplicacion de base por altura
	 */
	public int rectangulo(int altura, int base){
		return base*altura;
	}
	/**
	 * 
	 * @param lado tipo double
	 * @return la operacion para calcular el área del triangulo equilatero
	 */
	public double trianguloE(double lado){
		double raiz=Math.sqrt(3);
		double elevar=Math.pow(lado, 2);
		return raiz/4*elevar;
	}
	/**
	 * 
	 * @param lado tipo entero
	 * @param base tipo entero
	 * @return la operacion para calcular el área del triangulo isosceles
	 */
	
	public int trianguloI(int lado, int base){
		return base*lado/2;
	}
	/**
	 * 
	 * @param lado1 tipo float
	 * @param lado2 tipo float
	 * @param lado3 tipo float
	 * @return la operacion para calcular el área de el triangulo escaleno
	 */
	public float trianguloEs(float lado1, float lado2, float lado3){
		float semiper=(lado1+lado2+lado3)/2;
		float area1=semiper*((semiper-lado1)*(semiper-lado2)*(semiper-lado3));
		
		float raiz=(float) Math.sqrt(area1);
		return raiz;
		
	}
	/**
	 * 
	 * @param radio tipo double
	 * @return la operacion para calcular el área de el circulo
	 */
	public double circulo(double radio){
		return 3.1416*Math.pow(radio, 2);
		
	}
	
}
