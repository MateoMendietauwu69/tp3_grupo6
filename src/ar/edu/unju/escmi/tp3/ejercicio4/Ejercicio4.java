package ar.edu.unju.escmi.tp3.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente[] clientes = new Cliente[4];

        int cantidadClientes = 0; 
        int opcion = 0;

        do {
            System.out.println("Opciones");
            System.out.println("1|Crear un cliente");
            System.out.println("2|Mostrar los datos");
            System.out.println("3|Mostrar todos los clientes");
            System.out.println("4|Mostrar todos los clientes por categoría");
            System.out.println("5|Salir");
            System.out.print("Elegior opcion: ");
            

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opcion invalida, ingrese otro numero");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    if (cantidadClientes < 4) {
                        System.out.print("Ingresar el DNI: ");
                        String dni = scanner.nextLine();
                        
                        System.out.print("Ingresar el nombre: ");
                        String nombre = scanner.nextLine();
                        
                        System.out.print("Ingresar la categoría (un carácter): ");
                        char categoria = scanner.nextLine().charAt(0);

                        clientes[cantidadClientes] = new Cliente(dni, nombre, categoria);
                        cantidadClientes++;
                        System.out.println("Cliente se creo");
                    } else {
                        System.out.println("Lleaste al limite de clientes");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el DNI: ");
                    String dniBuscar = scanner.nextLine();
                    boolean encontrado = false;
                    
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (clientes[i].getDni().equalsIgnoreCase(dniBuscar)) {
                            System.out.println("Datos del cliente: " + clientes[i].toString());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontró el dni");
                    }
                    break;

                case 3:
                    if (cantidadClientes == 0) {
                        System.out.println("No hay clientes registrados");
                    } else {
                        System.out.println("\nLista de Clientes ");
                        for (int i = 0; i < cantidadClientes; i++) {
                            System.out.println(clientes[i].toString());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la categoría: ");
                    char catBuscar = scanner.nextLine().charAt(0);
                    boolean hayCategoria = false;
                    
                    System.out.println("\n Clientes de la categoría '" + catBuscar + "'");
                    for (int i = 0; i < cantidadClientes; i++) {
                        if (Character.toUpperCase(clientes[i].getCategoria()) == Character.toUpperCase(catBuscar)) {
                            System.out.println(clientes[i].toString());
                            hayCategoria = true;
                        }
                    }
                    if (!hayCategoria) {
                        System.out.println("No se encontraron clientes con esa categorí");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida, vuelva a intentar");
            }
        } while (opcion != 5);

        scanner.close();
    }
}