import java.util.Scanner;

public class Agenda {

    Scanner sc = new Scanner(System.in);

    //variables y constantes
    private Contactos contactos[];

    //constructor

    //por defecto
    public Agenda() {
        contactos = new Contactos[10];
    }

    //constructor con parametro numero de contactos
    public Agenda(int numero) {
        contactos = new Contactos[numero];
    }

    //Metodos

    //aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más
    // a la agenda se indicara por pantalla. No se pueden meter contactos que existan,
    // es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
    public void aniadirContacto(Contactos c) {

        boolean hueco = false;

        if (existeContacto(c)) {
            System.out.println("El contacto ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda esta llena");
        } else {
            for (int i = 0; i < contactos.length && !hueco; i++) {
                if (contactos[i] == null) {
                    contactos[i] = c;
                    hueco = true;
                }
            }
            if (hueco) {
                System.out.println("El contacto se ha añadido");
            } else {
                System.out.println("El contacto no se ha podido añadir");
            }
        }

    }

    //existeContacto(Contacto c): indica si el contacto pasado existe o no.
    public boolean existeContacto(Contactos c) {
        for (int i = 0; i < contactos.length; i++) {

            if (contactos[i] != null && c.getNombre().equalsIgnoreCase(contactos[i].getNombre())) {
                return true;
            }
        }
        return false;
    }

    //listarContactos(): Lista toda la agenda
    public void listarContactos() {
        boolean existe = false;
        for (int i = 0; i < contactos.length; i++) {
            System.out.println(contactos[i]);
        }

    }

    //buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
    public boolean buscaContacto(String nombre) {

        boolean encontrado= false;

        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre) && contactos[i] != null) {

                System.out.println("El contacto de nombre: " + contactos[i].getNombre() + " tiene el telefono: "
                        + contactos[i].getNumero());
                encontrado=true;
            }
        }
        if (!encontrado){
            System.out.println("No se ha encontrado el contacto");
        }

    }

    //eliminarContacto(Contacto c): elimina el contacto de la agenda,
    // indica si se ha eliminado o no por pantalla
    public void eliminarContacto() {

        String nombre2 = "";
        System.out.println("Introduce el nombre del contacto que quieres eliminar");
        nombre2 = sc.next();

        boolean encontrado=false;

        for (int i = 0; i < contactos.length && !encontrado; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre2) && contactos[i]!=null) {
                contactos[i] = null;
                encontrado=true;
            }
        }
        if (encontrado){
            System.out.println("Se ha eliminado el contacto");
        }else
        System.out.println("No se ha encontrado ningun contacto con ese nombre");

    }

    //agendaLlena(): indica si la agenda está llena.
    public boolean agendaLlena() {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                return false;//Aun quedan huecos en la agenda
            }
        }
        return true;//La agenda estaria llena

    }

    //huecosLibres(): indica cuantos contactos más podemos meter.
    public int huecosLibres() {
        int cuentahuecos = 0;
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                System.out.println("El lugar en la agenda nº: " + i + " esta vacio");
                cuentahuecos++;
            }
        }
        return cuentahuecos;
    }


}

