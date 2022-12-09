package RETO3;
import java.util.Scanner;
public class Persona {

    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private double peso;
    private double estatura;

    
    Scanner in = new Scanner (System.in);

    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public Persona(){

    }

    public Persona(String tipoDoc, int documento, String nombre, String apellido, int edad, String sexo, double peso,
            double estatura) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
    } 

    public void personalInformacion(){
        System.out.println("Ingrese el tipo de documento");
        setTipoDoc(in.next());
        System.out.println("");
        System.out.println("Ingrese el numero de " +getTipoDoc());
        setDocumento(in.nextInt());
        System.out.println("");
        System.out.println("Ingrese el nombre");
        setNombre(in.next());
        System.out.println("");
        System.out.println("Ingrese el apellido");
        setApellido(in.next());
        System.out.println("");
        System.out.println("Ingrese la edad");
        setEdad(in.nextInt());
        System.out.println("");
        System.out.println("Ingrese el sexo");
        setSexo(in.next());
        System.out.println("");
        System.out.println("Ingrese el peso");
        setPeso(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese la estatura");
        setEstatura(in.nextDouble());
        System.out.println("");
    }
}
