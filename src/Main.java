
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Panel miPanel=new Panel();
        miPanel.setVisible(true);


        //Creamos objeto Agenda para hacer todo tipo de movimientos en ella
        Agenda agenda = new Agenda(5);
        Contactos contacto;

        //variables
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        int telefono = 0;

        System.out.println("bienvenidos a tu Agenda");
        System.out.println("-----------------------");
        System.out.println("Elige la opcion que quieres hacer");
        try {
            do {

                System.out.println("Introducir contacto nuevo: introduce 1");
                System.out.println("Buscar contacto por nombre: introduce 2");
                System.out.println("Eliminar contacto: introduce 3");
                System.out.println("Listar todos los contactos: introduce 4");
                System.out.println("Cuantos huecos quedan en la agenda: introduce 5");
                System.out.println("-------------------------------------------------");
                System.out.println("Para salir: introduce 0");

                System.out.println("Elige una opción");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("introduce un nombre");
                        nombre = sc.next();
                        System.out.println("introduce el telefono");
                        telefono = sc.nextInt();

                        contacto = new Contactos(nombre, telefono);

                        agenda.aniadirContacto(contacto);
                        break;
                    case 2:
                        System.out.println("Introduce el contacto que quieras buscar");
                        sc.nextLine();
                        nombre = sc.nextLine();

                        agenda.buscaContacto(nombre);
                        break;
                    case 3:
                        agenda.eliminarContacto();
                        break;
                    case 4:
                        agenda.listarContactos();
                        System.out.println("-------------------------------------------------");

                        break;
                    case 5:
                        agenda.huecosLibres();
                        System.out.println("-------------------------------------------------");

                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Introduce un numero correcto");
                }

            } while (opcion != 0);

        } catch (Exception e) {
            System.out.println("Algo ha salido mal, introduce un numero valido");
            sc.next();
        }
        System.out.println("Muchas gracias por utilizar su agenda");
    }


}
