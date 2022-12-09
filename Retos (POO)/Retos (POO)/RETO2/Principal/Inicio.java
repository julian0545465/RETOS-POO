package RETO2.Principal;

import RETO2.Salud2.Persona2;

public class Inicio {
    public static void main (String[]args){
        double response;
        Persona2 persona = new Persona2();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.edad();
        response = persona.calcularlmc();
        if(response <= 20){
            System.out.println("El peso está por debajo de lo ideal");
            System.out.println("");
        }
        else if (response >= 20 && response <=25){
            System.out.println("El peso ideal");
            System.out.println("");
        }
        else{
            System.out.println("Sobrepeso");
            System.out.println("");
        }
    }
}
