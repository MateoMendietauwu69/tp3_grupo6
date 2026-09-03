package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    
    private String dni;
    private String nom;
    private LocalDate fechna;
    private String domi;
    private String provi;

    public Persona(){

    }

    public Persona(String dni, String nom, LocalDate fechna, String domi, String provi){
        this.dni = dni;
        this.nom = nom;
        this.fechna = fechna;
        this.domi = domi;
        this.provi = provi;
    }

    public Persona(String dni, String nom, LocalDate fechna){
        this.dni = dni;
        this.nom = nom;
        this.fechna = fechna;
        this.provi = "Jujuy";
    }

    public String getdni(){
        return dni;
    }

    public String getnom(){
        return nom;
    }  

    public LocalDate getfechna(){
        return fechna;
    }

    public String getdomi(){
        return domi;
    }

    public String getprovi(){
        return provi;
    }

    public void setdni(String dni){
        this.dni = dni;
    }

    public void setnom(String nom){
        this.nom = nom;
    }

    public void setfechna(LocalDate fechna){
        this.fechna = fechna;
    }

    public void setdomi(String domi){
        this.domi = domi;
    }

    public void setprovi(String provi){
        this.provi = provi;
    }

    public int edad(){
        LocalDate diaac = LocalDate.now();

        return Period.between(fechna, diaac).getYears();
    }

    public boolean mayoredad(){
        return edad() > 18;
    }

    public void datos(){
        System.out.println("Datos de " + nom);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de nacimiento: " + fechna);
        System.out.println("Domicilio: " + domi);
        System.out.println("Provincia: " + provi);
        System.out.println("Edad: " + edad());
        if(mayoredad())
            System.out.println("La persona es mayor de edad");
        else
            System.out.println("La persona no es mayor de edad");
    }
}