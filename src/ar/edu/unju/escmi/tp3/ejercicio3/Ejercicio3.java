package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Empleado empleado = null;
        int opcion = 0;
        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1- Crear empleado");
            System.out.println("2- Aumentar Salario");
            System.out.println("3- Mostrar los datos del empleado.");
            System.out.println("4- Salir.");
            System.out.print("Ingrese una opción: ");
            
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el búfer
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); // Limpiar entrada inválida
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Crear Empleado ---");
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el legajo: ");
                    int legajo = scanner.nextInt();

                    System.out.print("Ingrese el salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine(); // Limpiar el búfer

                    // Instanciación con constructor parametrizado
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println("Empleado creado exitosamente.");
                    break;

                case 2:
                    System.out.println("\n--- Aumentar Salario ---");
                    if (empleado == null) {
                        System.out.println("Error: Primero debe crear un empleado (Opción 1).");
                    } else {
                        System.out.print("Ingrese el número de legajo del empleado: ");
                        int legajoBusqueda = scanner.nextInt();
                        scanner.nextLine();

                        if (legajoBusqueda == empleado.getLegajo()) {
                            empleado.aumentarSalario();
                            System.out.println("Aumento por mérito ($" + Empleado.AUMENTO_MERITO + ") aplicado con éxito.");
                        } else {
                            System.out.println("El legajo ingresado no coincide con el empleado registrado.");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Datos del Empleado ---");
                    if (empleado == null) {
                        System.out.println("Error: No existe ningún empleado registrado.");
                    } else {
                        empleado.mostrarDatos();
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
        

}
