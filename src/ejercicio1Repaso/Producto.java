package ejercicio1Repaso;
//clase pojo 

//Si en el enunciado no viene una guia para hacer las clases empezaremos por las clases POJO que son las más simples 
public class Producto {
	//Atributos de nuestra clase Producto
	private int id;
	private String nombre;
	private double precioFabrica;
	private int seccion; //tres secciones (se guardan en un int y no un boolean porque son mas de dos opciones)
	private boolean enVenta;
	//Acabamos de definir el objeto en nuestra aplicación 
	
	//los constructores son metodos que se utilizan para instanciar/crear objetos y siempre se realizan eln la clase POJO
	//Constructor vacío 
	public void Producto() {
		
	}
	//Constructor completo 
	public Producto(int id, String nombre, double precioFabrica, int seccion, boolean enVenta) {
		this.id=id;
		this.nombre = nombre;
		this.precioFabrica = precioFabrica;
		this.seccion = seccion;
		this.enVenta = enVenta;
	}
	
	//Getters and setters 
	
	public String getNombre() {
		return nombre; 
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioFabrica() {
		return precioFabrica;
	}
	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}
	public int getSeccion() {
		return seccion;
	}
	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}
	public boolean isEnVenta() {
		return enVenta;
	}
	public void setEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}
	//Los  métodos de obtención “getter” y asignación “setter , sirven para acceder a
	//los atributos de un objeto desde otra clase(tenemos que tener en cuenta el nivel de acceso)
	//el nivel de acceso de lo que sirve es para ver si una parte del código puede acceder 
	//a otras partes del código (hay tres niveles de acceso 1º Ninguno(se puede acceder a él) 2º Public(pueden acceder desde cualquier paquete o clase ) 
	//3º Private (solo se peude acceder a ellos desde la misma clase, para acceder a atributos private se realiza con los getters and setters) 
	
	
	//Método ToString
	@Override
	public String toString() {
		return "Producto [id =" + id + ", nombre=" + nombre + ", precioFabrica=" + precioFabrica + ", seccion=" + seccion + ", enVenta="
				+ enVenta + "]";
	}
	//Sirve para poder cambiar cualquier valor númerico a cadena de caracteres
	

	
	
	//TODO tengo que hacer el metodo buscar por id
	
	
}
