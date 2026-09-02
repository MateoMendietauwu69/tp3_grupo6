package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
	
	//atributos
	private String nombre;
    private int legajo;
    private double salario;
    
    
    public static final double SALARIO_MINIMO = 600000.00;
    public static final double AUMENTO_MERITO = 90000.00;
    
    
	//constructor
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.printf("Salario $: %.2f%n", salario);
    }
    
    public void aumentarSalario() {
        this.salario += AUMENTO_MERITO;
    }
    
}
