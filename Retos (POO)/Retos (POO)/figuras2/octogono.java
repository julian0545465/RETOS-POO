package figuras2;

import java.util.Scanner;

public class octogono extends figurasGeometricass{
    Scanner in = new Scanner(System.in);

    private double ladoO, apotemaO, areaO, perimetroO;

    
    public octogono() {
    }

    public octogono(double ladoO, double apotemaO, double areaO, double perimetroO) {
        this.ladoO = ladoO;
        this.apotemaO = apotemaO;
        this.areaO = areaO;
        this.perimetroO = perimetroO;
    }

    public double getLadoO() {
        return ladoO;
    }

    public void setLadoO(double ladoO) {
        this.ladoO = ladoO;
    }

    public double getApotemaO() {
        return apotemaO;
    }

    public void setApotemaO(double apotemaO) {
        this.apotemaO = apotemaO;
    }

    public double getAreaO() {
        return areaO;
    }

    public void setAreaO(double areaO) {
        this.areaO = areaO;
    }

    public double getPerimetroO() {
        return perimetroO;
    }

    public void setPerimetroO(double perimetroO) {
        this.perimetroO = perimetroO;
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        System.out.println("Ingrese el perimetro del octogono");
        setPerimetroO(in.nextDouble());
        System.out.println("");
        System.out.println("Ingrese la apotema del octogono");
        setApotemaO(in.nextDouble());
        System.out.println("");
        setAreaO((getPerimetroO()*getApotemaO())/2);
        System.out.println("El area del octogono es: " +getAreaO());

    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Ingrese el lado del hexagono");
        setLadoO(in.nextDouble());
        System.out.println("");
        setPerimetroO(getLadoO()*8);
        System.out.println("El perimetro del hexagono es: " +getPerimetroO());
        // TODO Auto-generated method stub
       
    }
    
}
