package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple{
    private String nombre;
    private String color;
    private float peso;
    private String raza;
    private int edad;
    private String sexo;

    public GatoSimple(String nombre, String color, float peso, String raza, int edad, String sexo)
    {
        this.nombre=nombre;
        this.color=color;
        this.peso=peso;
        this.raza=raza;
        this.edad=edad;
        this.sexo=sexo;
    }

    public void comer(String comida)
    {
        if(comida.equals("pescado") || comida.equals("Pescado"))
            System.out.println("Que rico ¡Gracias!!");
        else
            System.out.println("Lo siento, yo solo como pescado");
    }

    public void maullar()
    {
        System.out.println("Miauu");
    }

    public void ronronear()
    {
        System.out.println("prrrr");
    }

    public void pelear(GatoSimple GatoContrincante)
    {
        if(sexo.equals("hembra"))
            System.out.println(nombre + ": No me gusta pelear");
        else if(sexo.equals("macho"))
        {
            if(GatoContrincante.sexo.equals("hembra"))
                System.out.println(nombre + ": no peleo contra gatitas");
            else if(GatoContrincante.sexo.equals("macho"))
                System.out.println(nombre + ": ¡Ven aquí que te vas a enterar!");
        }
    }

    public void mostrarinfo()
    {
        System.out.println();
        System.out.println("NOMBRE DEL GATO: "+ nombre);
        System.out.println("COLOR: "+ color);
        System.out.println("PESO: "+ peso);
        System.out.println("RAZA: "+ raza);
        System.out.println("EDAD: "+ edad);
        System.out.println("SEXO: "+ sexo);
        System.out.println();
    }
}
