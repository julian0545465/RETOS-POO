package RETO1.Salud;
import java.util.Scanner;
public class Persona {
 
    private int documento, edad;
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
        in.close();

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

    
    public void calcularlmc(){
        pesoActual = peso/estatura*2;
        if(pesoActual <= 20){
            System.out.println("El peso está por debajo de lo ideal");
            System.out.println("");
        }
        else if (pesoActual >= 20 && pesoActual <=25){
            System.out.println("El peso ideal");
            System.out.println("");
        }
        else{
            System.out.println("Sobrepeso");
            System.out.println("");
        }

    }

    public void mayorEdad(){
        if(edad >=18){
            System.out.println("Usted es mayor de edad");
            System.out.println("");
        }
        else {
            System.out.println("Usted es menor de edad");
        }
    }

}


    // Si en veces de colocar public de coloca static que es un método estático es un método que tiene sentido invocarla sin crear previamente ningun objeto
  



