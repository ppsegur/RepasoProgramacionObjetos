package ejercicio1Repaso;

import java.util.Arrays; 
import java.util.Iterator;


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
	//Constructor vacio 
	public Tienda() {
		
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
	//TOSTRING
	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + ", numProductos=" + numProductos + ", numTrabajadores="
				+ numTrabajadores + "]";
	}
	
	
	
	
	//Métodos Crud de agregar Producto a una clase
	//Siempre con un verbo infinitivo que describa lo que hace el método, sin ñ ni tildes, la segunda palabra del nombre del método en mayúcula.
	//La segunda palabra(void en este caso) nos dice que devuelve el método puede ser int void double...
	public void agregarProducto(Producto p) {		//entre paréntesis se pasan los parámetros 
		listado[numProductos]= p; 			//el nuevo producto (p) se guarda en la lista de Productos 
		numProductos++; 					//Despues añadimos esta línea para que cada vez que se agrege un nuevo producto se agrande su número de productos 
	}
	
	public void mostrarProductos() {
		for (int i = 0; i < numProductos; i++) {  //El for recorre el array y 
		System.out.println(listado[i]);	
		} }
			
	public void mostrarLista(Producto [] lista) {
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]!=null) {
				System.out.println(lista[i]);
			}
		}
		
		}
	
		
	
	public Producto findByIdV2(int producto) {
		int i = 0;
		boolean encontrado = false;
		while(i<numProductos && !encontrado) {
			Producto delista = listado[i];
			if(delista.getId()==producto) {
				encontrado = true;
			}else {
				i++;
			}
		}if(encontrado) {
			return listado[i];
		}else {
			return null;
		}
	}
	
		//Buscar por seccion para que nos devuelva un array
		//en este caso nos devolvería el array de listaencontrados segun la seccion que nos pasan (int)
		public Producto[] buscarPorSeccion(int seccion) {	
			int index =0 ;	
			Producto[] listaEncontrado = new Producto[numProductos];//Inicializamos el nuevo array 
			while(index<numProductos) {			 
				if(listado[index].getSeccion()== seccion) {
					listaEncontrado[index] = listado[index];	
				}
				index++;
				
			}
			return listaEncontrado;
		}
		public double calcularPVP(double porcentaje) {
			
			double pvp = 
			return pvp;
			
		}
		} 
		//buscar el producto con el precio más bajo 
		//TODO metodo donde se pasa un porcentaje que quiera ganar y sea sumado al precioBase 
