package figuras2;

import java.util.Scanner;

public class hexagono extends figurasGeometricass {
    Scanner in = new Scanner(System.in);


    private double lado, apotema, areah, perimetroh;


    public hexagono(double lado, double apotema, double areah, double perimetroh) {
        this.lado = lado;
        this.apotema = apotema;
        this.areah = areah;
        this.perimetroh = perimetroh;
    }


    public double getLado() {
        return lado;
    }


    public void setLado(double lado) {
        this.lado = lado;
    }


    public double getApotema() {
        return apotema;
    }


    public void setApotema(double apotema) {
        this.apotema = apotema;
    }


    public double getAreah() {
        return areah;
    }


    public void setAreah(double areah) {
        this.areah = areah;
    }


    public double getPerimetroh() {
        return perimetroh;
    }


    public void setPerimetroh(double perimetroh) {
        this.perimetroh = perimetroh;
    }


    @Override
    public void calcularArea() {
        System.out.println("Ingrese el perimetro del hexagono");
        setPerimetroh(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese la apotema del hexagono");
        setApotema(in.nextDouble());
        System.out.println("");
        setAreah((getPerimetroh()*getApotema())/2);
        System.out.println("El area del hexagono es: " +getAreah());

        // TODO Auto-generated method stub

    

    }


    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese el lado del hexagono");
        setLado(in.nextDouble());
        System.out.println("");
        setPerimetroh(getLado()*6);
        System.out.println("El perimetro del hexagono es: " +getPerimetroh());

        // TODO Auto-generated method stub


    }


    
}
