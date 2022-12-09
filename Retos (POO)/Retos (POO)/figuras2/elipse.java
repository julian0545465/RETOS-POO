package figuras2;

import java.util.Scanner;

public class elipse extends figurasGeometricass {
    Scanner in = new Scanner(System.in);    

    double rmenor, rmayor, area, perimetro;
    private final double pi = 3.1416;

     public elipse(){

     }

   


    public elipse(double rmenor, double rmayor, double area, double perimetro) {
        this.rmenor = rmenor;
        this.rmayor = rmayor;
        this.area = area;
        this.perimetro = perimetro;
    }






    public double getRmenor() {
        return rmenor;
    }
    public void setRmenor(double rmenor) {
        this.rmenor = rmenor;
    }
    public double getRmayor() {
        return rmayor;
    }
    public void setRmayor(double rmayor) {
        this.rmayor = rmayor;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    public double getPi() {
        return pi;
    }



    @Override
    public void calcularArea() {

        System.out.println("Ingrese el radio menor del elipse");
        setRmenor(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese el radio mayor del elipse");
        setRmayor(in.nextDouble());
        System.out.println("");
        setArea(getPi()*(getRmenor()*getRmayor()));
        System.out.println("El area del elipse: "+getArea());
        System.out.println("");
        
    

    }


    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese el radio menor del elipse");
        setRmenor(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese el radio mayor del elipse");
        setRmayor(in.nextDouble());
        System.out.println("");
        setPerimetro(getPi()*(getRmenor()+getRmayor()));
        System.out.println("El perimetro del elipse: "+getPerimetro());
        System.out.println("");

    }


    



    
}
