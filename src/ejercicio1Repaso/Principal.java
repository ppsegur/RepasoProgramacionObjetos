package ejercicio1Repaso;

import utilidades.Leer;

public class Principal {
//Esta será la clase principal con el método main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto("Lechuga",1, 1, true);//normalmente no se crean objetos pollos vacios porque es crear NADA,
		//aqui no estamos guardando datos aqui lo que haremos es dar la dirección de memoria que se guardará en p 
		//Como podemos ver el Producto esta metido a cascaporras 
		//dentro de los paréntesis metemos los datos de un producto en el mimso tipo de dato que le damos en la clase pojo(en su contructor(y sus parámetros)
		System.out.println(p1.getPrecioFabrica());//esto nos mostrará el precioFabrica, la p muestra la clase a la que se refiere 
		
		int op, lecturaVenta, numProductos, numTrabajadores ,tam = 100;
		Producto []listado = new Producto[tam];
		Tienda t = new Tienda(listado,tam,3);
		String nombre;
		double precioFabrica;
		int seccion; 
		boolean enVenta;

		do {
		System.out.println("""
					Alimentación Luna 
			Pulse 1 para agregar un producto 
			Pulse 2 para mostrar la lista de productos
				""");
		op=Leer.datoInt();
		
			switch (op) {
			case 0:
				System.out.println("Saliendo del programa ");
				break;
			case 1: 
				System.out.println("Diga el nombre del producto que quiere añadir ");
				nombre=Leer.dato();
				System.out.println("Diga su precio de fábrica");
				precioFabrica = Leer.datoDouble();
				System.out.println("Diga la sección del producto"
						+"1. Alimentacion 2. Electrónica 3. Ropa ");
			seccion = Leer.datoInt();
				System.out.println("Diga si esta en venta su producto(Pulse 1 si esta en venta o 0 para decir que no ");
				lecturaVenta=Leer.datoInt();
				if(lecturaVenta==1) {
					enVenta = true;
				}else {
					enVenta = false;
				}
				//Hay dos formar de termianr el agregado
				//1º forma(creando el producto antes)
				Producto p = new Producto(nombre,precioFabrica,seccion,enVenta);
				t.agregarProducto(p);
				//2º Forma(instanciando directamente el producto)
				t.agregarProducto(new Producto(nombre,precioFabrica,seccion,enVenta));
			
			default:
				break;
			}
		} while (op!=0);
	
	
	
	
	}

}
