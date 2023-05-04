import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Por favor introduzca el precio del objeto: ");

        Scanner entrada= new Scanner(System.in);
        double precio= entrada.nextDouble();

        double cosa= calcularIVA(precio);
        System.out.println(cosa);

    }

    static double calcularIVA(double v){

        System.out.println("Precio producto: " + v);
        System.out.println("IVA: " + (v * 0.19));

        System.out.print("\nPrecio + IVA: ");
        v+= (v*0.19);

        return v;
    }
    
    //This is just a test v2

}
