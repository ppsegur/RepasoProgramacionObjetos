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
	public int findById(int id) { //Buscar por id 
		int i = 0;
		boolean encontrado = false;
		while(i<numProductos && !encontrado) {
			Producto delista = listado[i];
			if(delista.getId()==id) { // == id en vez de al producto
				encontrado = true;
			}else {
				i++;
			}
		}if(encontrado) { //devolverá la i
			return i;
		}else {
			return -1; //-1 porque es una posición inexistente en un array 
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
		public double calcularPVP(double porcentaje, int id) {
			int cien = 100;
			double nuevoPrecio= 0;
			Producto p;
			p=findByIdV2(id);
			nuevoPrecio = p.getPrecioFabrica()+(p.getPrecioFabrica() * porcentaje)/100;
			p.setPrecioFinal(nuevoPrecio);
			return nuevoPrecio;
			
		}
		 public void cambiarPrecioPorSeccion(int seccion, double nuevoPrecioFabrica) {//Mo hace falta el findBySeccion
		        for (int i = 0; i < numProductos; i++) {
		            if (listado[i].getSeccion() == seccion) { //Ya que con esto comprobaremos la sección de UN PRODUCTO, como es un bucle hará uno tras otra
		                listado[i].setPrecioFabrica(nuevoPrecioFabrica);
		            }
		        } 
		}
		 public double aplicarDescuento(double descuento, int id) {
			 double precioDescontado =0;
			 Producto p;
			 p = findByIdV2(id);
			 double cien = 100;
			
			 if(p.getPrecioFinal()!= 0) {//No se deben usar sysos como opcion podriamos poner este syso en el pincipal 
				 precioDescontado = p.getPrecioFinal() - (p.getPrecioFinal() * descuento )/ cien;
			 }else {
				 
			 }
			 return precioDescontado;}
		 //También podríamos haberlo hecho con el metodo de calcularPvp pasandole también el porcentaje de pvp como parámetro
		//retunr calcularPvp(porcentaje, id) - (calcularPVP(ganancia, id) * descuento / cien)
	public int eliminarSeccion (int seccion) {
		int contador = 0;
		//Lo podriamos en void pero vamos a ponerlo en int para devolveer el num de productos que se veran afectados
		for (int i = 0; i < numProductos; i++) {
			if(listado[i].getSeccion()==seccion){
				listado[i].setEnVenta(false);
				contador++;
			}
		
			
		}
		return contador ;
	}
}
//buscar el producto con el precio más bajo 
	