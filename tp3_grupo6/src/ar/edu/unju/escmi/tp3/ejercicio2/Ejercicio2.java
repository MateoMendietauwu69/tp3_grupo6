package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<GatoSimple> gatos = new ArrayList<>();
        int opcion = 0, edad;
        String nombre, color, raza, sexo = "", comida;
        float peso;

        while (opcion != 5) {
            System.out.println("1. Crear gato simple");
            System.out.println("2. Dar de comer a un gato simple");
            System.out.println("3. Mostrar todos los gatos");
            System.out.println("4. Crear gato contrincante para pelear con un gato simple");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println("//CREAR NUEVO GATO//");
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del gato: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el color del gato: ");
                    color = scanner.next();
                    System.out.print("Ingrese el peso del gato: ");
                    peso = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("Ingrese la raza del gato: ");
                    raza = scanner.nextLine();
                    System.out.print("Ingrese la edad del gato: ");
                    edad = scanner.nextInt();
                    while (!sexo.equals("macho") && !sexo.equals("hembra")) {
                        System.out.print("Ingrese el sexo del gato (macho/hembra): ");
                        sexo = scanner.next();
                        if (!sexo.equals("macho") && !sexo.equals("hembra"))
                            System.out.println("sexo no valido");
                    }
                    GatoSimple gato = new GatoSimple(nombre, color, peso, raza, edad, sexo);
                    gatos.add(gato);
                    System.out.println("//SE CREO UN NUEVO GATO CORRECTAMENTE//");
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    if (gatos.size() > 0) {
                        System.out.println();
                        System.out.print("Ingrese la comida: ");
                        comida = scanner.next();
                        gatos.get(gatos.size() - 1).comer(comida);
                        System.out.println();
                    } else {
                        System.out.println("No hay ningun gato para alimentar");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    if (gatos.size() > 0) {
                        System.out.println("//LISTA DE GATOS//");
                        for (int i = 0; i < gatos.size(); i++)
                            gatos.get(i).mostrarinfo();
                    } else
                        System.out.println("No hay ningun gato");
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    if (gatos.size() > 0) {
                        System.out.println();
                        System.out.println();
                        System.out.println("//CREAR NUEVO GATO CONTRINCANTE//");
                        scanner.nextLine();
                        System.out.print("Ingrese el nombre del gato: ");
                        nombre = scanner.nextLine();
                        System.out.print("Ingrese el color del gato: ");
                        color = scanner.next();
                        System.out.print("Ingrese el peso del gato: ");
                        peso = scanner.nextFloat();
                        scanner.nextLine();
                        System.out.print("Ingrese la raza del gato: ");
                        raza = scanner.nextLine();
                        System.out.print("Ingrese la edad del gato: ");
                        edad = scanner.nextInt();
                        System.out.print("Ingrese el sexo del gato (macho/hembra): ");
                        sexo = scanner.next();
                        GatoSimple gatocontrincante = new GatoSimple(nombre, color, peso, raza, edad, sexo);
                        gatos.add(gatocontrincante);
                        System.out.println("//SE CREO UN NUEVO GATO CONTRINCANTE CORRECTAMENTE//");
                        System.out.println();
                        gatos.get(gatos.size() - 2).pelear(gatocontrincante);
                        System.out.println();
                        System.out.println();
                    } else
                        System.out.println("No hay ningun gato");
                    break;
                case 5:
                    break;
                default:
                    System.out.println();
                    System.out.println(opcion + " no es una opcion");
                    System.out.println();
                    break;
            }
        }
        scanner.close();
    }
}
