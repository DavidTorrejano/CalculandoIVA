import java.util.Scanner;

public class ComparandoDias {

    public static void main(String[] args) {


        Scanner entrada= new Scanner(System.in);

        System.out.println("Por favor introduzca el día de la semana");

        String dia= entrada.nextLine();

        boolean lunes= dia.equalsIgnoreCase("lunes");
        boolean martes= dia.equalsIgnoreCase("martes");
        boolean miercoles= dia.equalsIgnoreCase("miercoles");
        boolean jueves= dia.equalsIgnoreCase("jueves");
        boolean viernes= dia.equalsIgnoreCase("viernes");
        boolean sabado= dia.equalsIgnoreCase("sábado");
        boolean domingo= dia.equalsIgnoreCase("domingo");


        if(lunes){
            System.out.println("El día de hoy en lunes, mañana será un gran martes");
        }
        else if (martes) {
            System.out.println("No te cases ni te vayas para otra parte");
        }
        else if(miercoles){
            System.out.println("El día que te da esperanza, ya casi");
        }
        else if(jueves){
            System.out.println("Bueno, prácticamente ya se acaba la semana");
        }
        else if(viernes){
            System.out.println("Esooo, el día por el que tanto esperabas");
        }
        else if(sabado){
            System.out.println("Nada más rico que disfrutar un sábado en casa");
        }
        else if(domingo){
            System.out.println("Ese hermoso día donde no sabes si estar feliz o llorar que otra semana empieza");
        }
        else{
            System.out.println("Eso no es un día de la semana, no puedes escapar.");
        }

    }
}
