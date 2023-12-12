package ejercicio1Repaso;
//clase pojo 

//Si en el enunciado no viene una guia para hacer las clases empezaremos por las clases POJO que son las más simples 
public class Producto {
	//Atributos de nuestra clase Producto
	private String nombre;
	private double precioFabrica;
	private int seccion; //tres secciones (se guardan en un int y no un boolean porque son mas de dos opciones)
	private boolean enVenta;
	//Acabamos de definir el objeto en nuestra aplicación 
	//los constructores son metodos que se utilizan para instancair/crear objetos y siempre se realizan eln la clase POJO
	//Constructor vacío 
	public void Producto() {
		
	}
	//Constructor completo 
	public Producto(String nombre, double precioFabrica, int seccion, boolean enVenta) {
		//
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}
	
}
