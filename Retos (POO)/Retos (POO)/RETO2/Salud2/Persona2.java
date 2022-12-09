package RETO2.Salud2;
import java.util.Scanner;
public class Persona2 {
 
    private int documento, edad, n1 = 2;
    private String tipoDoc, nombre, apellido, sexo;
    private double peso, estatura, pesoActual;
    Scanner in = new Scanner(System.in);

    public void pedirDatos (){
        System.out.println("Ingresar nombre de la persona");
        nombre = in.next();
        System.out.println("");

        System.out.println("Ingresar apellido de la persona");
        apellido = in.next();
        System.out.println("");

        System.out.println("Ingresar sexo de la persona");
        sexo = in.next();
        System.out.println("");
        
        System.out.println("Ingresar la edad de la persona");
        edad = in.nextInt();
        System.out.println("");

        System.out.println("Ingresar el tipo de documento de la persona");
        tipoDoc = in.next();
        System.out.println("");

        System.out.println("Ingresar el numero de documento");
        documento = in.nextInt();
        System.out.println("");

        System.out.println("Ingresar el peso de la persona");
        peso = in.nextDouble();
        System.out.println("");

        System.out.println("Ingresar la estatura de la persona");
        estatura = in.nextDouble();
        System.out.println("--------------------------------------------------------------------------------------------------");

    }


    public void mostrarPersona()
    {

        System.out.println("Nombre de la persona: " +nombre);
        System.out.println("");

        System.out.println("Apellido de la persona: " +apellido);
        System.out.println("");

        System.out.println("Sexo de la persona: " +sexo);
        System.out.println("");
        
        System.out.println("Edad de la persona: "+edad);
        System.out.println("");

        System.out.println("Tipo de documento de la persona: "+tipoDoc);
        System.out.println("");

        System.out.println("Numero de documento: " +documento);
        System.out.println("");

        System.out.println("Peso de la persona: " + peso);
        System.out.println("");

        System.out.println("Estatura de la persona: " +estatura);
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
    public double calcularlmc(){
        pesoActual = peso/estatura*n1;
        return pesoActual;

    }

    public void edad(){
        if(edad >=18){
            System.out.println("Usted es mayor de edad");
            System.out.println("");
        }
    }

}

