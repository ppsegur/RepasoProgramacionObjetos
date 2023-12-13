package ejercicio1Repaso;

import java.util.Arrays;

public class Tienda {
	//esta sería la clase gestión dónde eralizaremos la mayor parte de los métodos
	//COlocamos los atributos que peertenecen a la clase Tienda
	private Producto [] listado;
	private int numProductos;
	private int numTrabajadores ;
	
	//Constructores
	public Tienda(Producto[] listado, int numProductos, int numTrabajadores) {
		super();
		this.listado = listado;
		this.numProductos = numProductos;
		this.numTrabajadores = numTrabajadores;
	}
	//Getters and setters 
	public Producto[] getListado() {
		return listado;
	}
	public void setListado(Producto[] listado) {
		this.listado = listado;
	}
	public int getNumProductos() {
		return numProductos;
	}
	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	public int getNumTrabajadores() {
		return numTrabajadores;
	}
	public void setNumTrabajadores(int numTrabajadores) {
		this.numTrabajadores = numTrabajadores;
	}
	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	
	
	
	
	//Métodos Crud de agregar Producto a una clase
	//Siempre con un verbo infinitivo que describa lo que hace el método, sin ñ ni tildes, la segunda palabra del nombre del método en mayúcula.
	//La segunda palabra(void en este caso) nos dice que devuelve el método puede ser int void double...
	public void agregarProducto(Producto p) {//entre paréntesis se pasan los parámetros 
		listado[numProductos]= p; //el nuevo producto (p) se guarda en la lista de Productos 
		numProductos++; //Despues añadimos esta línea para que cada vez que se agrege un nuevo producto se agrande su número de productos 
	}
	
	public void mostrarProductos() {
		
	}
	
	
}
