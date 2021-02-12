import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creamos objeto Agenda para hacer todo tipo de movimientos en ella
        Agenda agenda = new Agenda();

        //variables
        int opcion=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("bienvenidos a tu Agenda");
        System.out.println("-----------------------");
        System.out.println("Elige la opcion que quieres hacer");

        do {

            System.out.println("Introducir contacto nuevo introduce 1");
            System.out.println("Buscar contacto por nombre introduce 2");
            System.out.println("Eliminar contacto introduce 3");
            System.out.println("Listar todos los contactos introduce 4");
            System.out.println("Para salir introduce 0");
            opcion = sc.nextInt();



        } while (opcion != 0);

    }


}
