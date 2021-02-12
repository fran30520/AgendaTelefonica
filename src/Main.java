
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creamos objeto Agenda para hacer todo tipo de movimientos en ella
        Agenda agenda = new Agenda();
        Contactos contacto;

        //variables
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        int telefono = 0;

        System.out.println("bienvenidos a tu Agenda");
        System.out.println("-----------------------");
        System.out.println("Elige la opcion que quieres hacer");

        do {

            System.out.println("Introducir contacto nuevo: introduce 1");
            System.out.println("Buscar contacto por nombre: introduce 2");
            System.out.println("Eliminar contacto: introduce 3");
            System.out.println("Listar todos los contactos: introduce 4");
            System.out.println("Para salir: introduce 0");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("introduce un nombre");
                    nombre = sc.nextLine();
                    System.out.println("introduce el telefono");
                    sc.nextInt();

                    contacto = new Contactos(nombre, telefono);

                    agenda.aniadirContacto(contacto);
                    break;
                case 2:
                    System.out.println("Introduce el contacto que quieras buscar");
                    nombre = sc.nextLine();

                    agenda.buscaContacto(nombre);
                    break;
                case 3:

                    agenda.eliminarContacto();
                    break;

                case 4:
                    agenda.listarContactos();
                    break;

                case 0:
                    break;
            }

        } while (opcion != 0);

    }


}
