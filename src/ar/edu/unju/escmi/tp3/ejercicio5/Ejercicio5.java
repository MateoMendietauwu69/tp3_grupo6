package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] productos = new Producto[3];
        int cantidadProductos = 0;
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE OPCIONES =====");
            System.out.println("1 - Crear producto.");
            System.out.println("2 - Mostrar productos.");
            System.out.println("3 - Modificar precio de producto.");
            System.out.println("4 - Mostrar los productos que superen un precio.");
            System.out.println("5 - Salir.");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    if (cantidadProductos < productos.length) {
                        Producto producto = new Producto();
                        System.out.print("Ingrese el código del producto: ");
                        producto.setCodigo(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Ingrese la descripción del producto: ");
                        producto.setDescripcion(scanner.nextLine());
                        System.out.print("Ingrese el precio del producto: ");
                        producto.setPrecio(scanner.nextDouble());
                        scanner.nextLine();
                        productos[cantidadProductos] = producto;
                        cantidadProductos++;
                        System.out.println("Producto creado exitosamente.");
                    } else {
                        System.out.println("No se pueden agregar más productos. El array está lleno.");
                    }
                    break;

                case 2:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos cargados.");
                    } else {
                        System.out.println("\n--- Lista de Productos ---");
                        for (int i = 0; i < cantidadProductos; i++) {
                            System.out.println(productos[i].toString());
                        }
                    }
                    break;

                case 3:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos cargados.");
                    } else {
                        System.out.print("Ingrese el código del producto a modificar: ");
                        int codigoBuscado = scanner.nextInt();
                        scanner.nextLine();
                        boolean encontrado = false;
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (productos[i].getCodigo() == codigoBuscado) {
                                System.out.print("Ingrese el nuevo precio: ");
                                productos[i].setPrecio(scanner.nextDouble());
                                scanner.nextLine();
                                System.out.println("Precio modificado exitosamente.");
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró un producto con el código: " + codigoBuscado);
                        }
                    }
                    break;

                case 4:
                    if (cantidadProductos == 0) {
                        System.out.println("No hay productos cargados.");
                    } else {
                        System.out.print("Ingrese el precio a superar: ");
                        double precioLimite = scanner.nextDouble();
                        scanner.nextLine();
                        boolean hayResultados = false;
                        System.out.println("\n--- Productos que superan el precio " + precioLimite + " ---");
                        for (int i = 0; i < cantidadProductos; i++) {
                            if (productos[i].getPrecio() > precioLimite) {
                                System.out.println(productos[i].toString());
                                hayResultados = true;
                            }
                        }
                        if (!hayResultados) {
                            System.out.println("No hay productos que superen el precio ingresado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}
