package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int op;

        do{
            System.out.println("-------------------------MENU-------------------------");
            System.out.println("1-Crear objeto con Constructor por defecto");
            System.out.println("2-Crear objeto con Constructor parametrizado");
            System.out.println("3-Crear objeto con Constructor (dni, nombre, fecha de nacimiento)");
            System.out.println("4-Mostrar personas");
            System.out.println("5-Salir");
            System.out.println("------------------------------------------------------");

            op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                
                    Persona persona1 = new Persona();

                    System.out.println("Ingrese DNI: ");
                    persona1.setdni(sc.nextLine());
                    System.out.println("Ingrese Nombre: ");
                    persona1.setnom(sc.nextLine());
                    System.out.println("Ingrese Fecha de nacimiento (año-mes-día): ");
                    persona1.setfechna(LocalDate.parse(sc.nextLine()));
                    System.out.println("Ingrese Domicilio: ");
                    persona1.setdomi(sc.nextLine());
                    System.out.println("Ingrese Provincia: ");
                    persona1.setprovi(sc.nextLine());

                    personas.add(persona1);

                    System.out.println("Persona creada correctamente");

                    break;
                case 2:

                    System.out.println("Ingrese DNI: ");
                    String dni = sc.nextLine();
                    System.out.println("Ingrese Nombre: ");
                    String nom = sc.nextLine();
                    System.out.println("Ingrese Fecha de nacimiento (año-mes-día): ");
                    LocalDate fechna = LocalDate.parse(sc.nextLine());
                    System.out.println("Ingrese Domicilio: ");
                    String domi = sc.nextLine();
                    System.out.println("Ingrese Provincia: ");
                    String provi = sc.nextLine();

                    Persona persona2 = new Persona(
                        dni,
                        nom,
                        fechna,
                        domi,
                        provi
                    );

                    personas.add(persona2);

                    System.out.println("Persona creada correctamente");

                    break;
                case 3:

                    System.out.println("Ingrese DNI: ");
                    String dni3 = sc.nextLine();
                    System.out.println("Ingrese Nombre: ");
                    String nom3 = sc.nextLine();
                    System.out.println("Ingrese Fecha de nacimiento (año-mes-día): ");
                    LocalDate fechna3 = LocalDate.parse(sc.nextLine());

                    Persona persona3 = new Persona(
                        dni3,
                        nom3,
                        fechna3
                    );

                    personas.add(persona3);

                    System.out.println("Persona creada correctamente");

                    break;
                case 4:

                    if(personas.isEmpty())
                        System.out.println("No hay personas creadas");
                    else{
                        System.out.println();
                        for(Persona persona : personas){
                            persona.datos();
                        }
                    }

                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(op != 5);
        sc.close();
    }
}
