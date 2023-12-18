package ejercicio1Repaso;

import utilidades.Leer;


/**
 * @author Pepe_Segura 
 * 
 */
public class Principal {
//Esta será la clase principal con el método main
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		
		//normalmente no se crean objetos pollos vacios porque es crear NADA,
		//aqui no estamos guardando datos aqui lo que haremos es dar la dirección de memoria que se guardará en p 
		//Como podemos ver el Producto esta metido a cascaporras 
		//dentro de los paréntesis metemos los datos de un producto en el mimso tipo de dato que le damos en la clase pojo(en su contructor(y sus parámetros)
		
		//System.out.println(p1.getPrecioFabrica());//esto nos mostrará el precioFabrica, la p muestra la clase a la que se refiere 
		
		int op, lecturaVenta, numProductos, numTrabajadores ,tam = 0, tam2 = 10;
	
		Producto []listado = new Producto[tam2];
		
		Tienda t = new Tienda(listado,tam,3);
		int id = 0;
		String nombre;
		Producto p;
		double precioFabrica, nuevoPrecioFabrica, descuento;
		int seccion; 
		boolean enVenta;
		Producto p1 = new Producto(1,"Lechuga",1, 1, true, 0);
		Producto p2 = new Producto(2,"Tomates",1.1, 1, true,0);
		Producto p3 = new Producto(3,"Cebolla",1.4, 1, true,0);
		Producto p4 = new Producto(4,"Calcetines",10, 2, true,0);
		Producto p5 = new Producto(5,"Cascos Xiaomi",120, 3, true,0);


		t.agregarProducto(p1);
		t.agregarProducto(p2);
		t.agregarProducto(p3);
		t.agregarProducto(p4);
		t.agregarProducto(p5);



		Producto prod = new Producto(); //case 5

		do {
		System.out.println("""
					Alimentación Luna 
			Pulse 1. Para agregar un producto 
			Pulse 2. Para mostrar la lista de productos
			Pulse 3. Para buscar por sección
			Pulse 4. Para calcular el precio de venta de un producto 
			Pulse 5. Para buscar un producto 
			Pulse 6. Para cambiar el precio de todos los productos de una seccion
			Pulse 7. Para poner descuento a un producto
			Pulse 8. Para eliminar una sección de la venta
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
						+" 1. Alimentacion 2. Electrónica 3. Ropa ");
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
				p = new Producto(id,nombre,precioFabrica,seccion,enVenta, 0);
				t.agregarProducto(p);
				//2º Forma(instanciando directamente el producto)
				//t.agregarProducto(new Producto(nombre,precioFabrica,seccion,enVenta));
			
				break;
			 case 2:
				 t.mostrarProductos();
				 break;
			 case 3:
				 System.out.println("Diga la sección que quiera(1 alimentacion ,2 electronica, 3 ropa)  ");
				 seccion = Leer.datoInt();
				 t.mostrarLista(t.buscarPorSeccion(seccion));
				 break;
			 case 4:
				 System.out.println("Diga el id del producto a calcular");
				 id = Leer.datoInt();
				 
				 System.out.println("Diga el porcentaje que quiere ganarle al precio ");
				 double porcentaje = Leer.datoDouble();
				 
				 System.out.println( t.calcularPVP(porcentaje, id));
				 break;
				 case 5:
					 System.out.println("Diga el id");
					 id =Leer.datoInt();
					 prod =t.findByIdV2(id);
					 
					 if(prod == null) {
						 	System.out.println("Producto no encontrado");
					 }else {
						 System.out.println(prod);//línea 53 aparece el prod como vacio para guardar el,m prducto buscado
					 }
					 
					 break;
				 case 6: 
					 System.out.println("Diga la sección");
					 seccion = Leer.datoInt();
					 System.out.println("Diga el nuevo precio");
					 nuevoPrecioFabrica = Leer.datoDouble();
					 t.cambiarPrecioPorSeccion(seccion, nuevoPrecioFabrica);
					 break;
				 case 7:
					 System.out.println("Diga el id del producto");
					 id = Leer.datoInt();
					 System.out.println("Diga el porcentaje que desea de descuento");
					 descuento = Leer.datoDouble();
					 if(t.aplicarDescuento(descuento, id)==0) {
						 System.out.println("Este producto no tiene calculado el pvp");
					 }else {
					 System.out.printf("El nuevo precio aplicando el descuento será de: %.2f ",t.aplicarDescuento(descuento, id));
					 }
					 break;
				 case 8:
					 System.out.println("Diga la sección que quiere eliminar");
					 seccion = Leer.datoInt();
					 System.out.println("El número de productos afectado será "+t.eliminarSeccion(seccion));
				 default:
				break;
			}
		} while (op!=0);
	
	
	
	
	}

}
