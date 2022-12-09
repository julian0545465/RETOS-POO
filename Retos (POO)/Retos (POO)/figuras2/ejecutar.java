package figuras2;
import java.util.Scanner;
public class ejecutar {
    
    public static void main(String[]args) {

        elipse e = new elipse(0, 0, 0, 0);
        hexagono h = new hexagono(0, 0, 0, 0);
        octogono o = new octogono(0, 0, 0, 0);
        
        int selection = 0, repeat = 1;
        Scanner in = new Scanner(System.in);

        while(repeat==1)
		{

        System.out.println("Ingresar una opción \n Ingresar el numero 1 para elegir la figura elipse \n Ingresar el numero 2 para elegir la figura hexagono \n Ingresar el numero 3 para elegir la figura octogono");
        selection = in.nextInt();
        System.out.println("");

     
        switch (selection)
		{  
			case 1:
				System.out.println("Elipse");
                System.out.println("");
				switch (1)
				{
					case 1: System.out.println("AREA");
					e.calcularArea();
                    case 2: System.out.println("PERIMETRO");
					e.calcularPerimetro();
                    break;

				}
				break;

			case 2:
				System.out.println("Hexagono");
                System.out.println("");

				switch (1)
				{
					case 1: System.out.println("AREA"); 
					h.calcularArea();
                    case 2: System.out.println("PERIMETRO");
					h.calcularPerimetro();
                    break;

				}
				break;
			case 3:
            System.out.println("Octogono");
            System.out.println("");
            switch (1)
            {
                case 1: System.out.println("AREA"); 
                o.calcularArea();
                case 2: System.out.println("PERIMETRO");
				o.calcularPerimetro();
                break;

            }
            break;

        }
        
			System.out.println("");
			System.out.println("¿Quiere volver a las opciones?");
			System.out.println("Ingresar una opción \n Ingresar el numero 1 para volver  \n Ingresar el numero 2 para salir ");
			repeat = in.nextInt();
			System.out.println("");

    }
        in.close();

        



        
    }
    
}
