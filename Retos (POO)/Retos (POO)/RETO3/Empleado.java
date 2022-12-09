package RETO3;
public class Empleado extends Persona {

    private String position;
    private double hourvalue;
    private double hourworked;
    private String department;
    private double fee;




    public Empleado(String tipoDoc, int documento, String nombre, String apellido, int edad, String sexo, double peso,
            double estatura, String position, double hourvalue, double hourworked, String department, double fee) {
        super(tipoDoc, documento, nombre, apellido, edad, sexo, peso, estatura);
        this.position = position;
        this.hourvalue = hourvalue;
        this.hourworked = hourworked;
        this.department = department;
        this.fee = fee;
    }



    public void calcularHonorarios(){
        System.out.println("Ingresar el cargo en su empresa senor@ " +getNombre());
        position = in.next();
        System.out.println("");
        System.out.println("Ingresar el valor de las horas trabajadas");
        hourvalue = in.nextDouble();
        System.out.println("");
        System.out.println("Ingresar las horas trabajadas");
        hourworked = in.nextDouble();
        System.out.println("");
        System.out.println("Ingresar el departamento");
        department = in.next();
        
        final double reteica = 0.966;
        fee = (hourvalue*hourworked)-reteica;


    }
    public void mostrarInformacion(){
        // System.out.println("Los honorarios del empleado " + getNombre() + " son "  + fee);
        System.out.println("");
        System.out.println("");
        System.out.println("INFORMACION PERSONAL \n Tipo de documento: " +getTipoDoc() + "\n Numero de documento: " +getDocumento()+ "\n Nombre: "+ getNombre()+ "\n Apellido: "+getApellido()+ "\n Cargo: "+position+ "\n Horas trabajadas: "+hourworked+ "\n Valor por hora: "+hourvalue+ "\n Total a pagar:"+fee);


    }
 
}
