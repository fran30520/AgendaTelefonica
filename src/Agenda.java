public class Agenda {

    //variables y constantes
    private Contactos contactos[];

    //constructor

    //por defecto
    public Agenda() {
        this.contactos = new Contactos[10];
    }
    //constructor con parametro numero de contactos
    public Agenda(int numero){
        this contactos=new Contactos[numero];
    }

    //Metodos

    //aniadirContacto(Contacto c): Añade un contacto a la agenda, sino se pueden meter más
    // a la agenda se indicara por pantalla. No se pueden meter contactos que existan,
    // es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
    public boolean aniadirContacto(Contactos c){
        if(!existeContacto(c)){
            c = new Contactos()

        }

    }

    //existeContacto(Conctacto c): indica si el contacto pasado existe o no.
    public boolean existeContacto(Contactos c){
        if(c.getNombre().equals(c)){
            System.out.println("El contacto ya existe");
            return false;
        }else {
            return true;
        }

    }
    //listarContactos(): Lista toda la agenda
    public void listarContactos(){

    }
    //buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
    public void buscaContacto(String nombre){

    }
    //eliminarContacto(Contacto c): elimina el contacto de la agenda,
    // indica si se ha eliminado o no por pantalla
    public void eliminarContacto(){

    }
    //agendaLlena(): indica si la agenda está llena.
    public boolean agendaLlena(){

    }
    //huecosLibres(): indica cuantos contactos más podemos meter.
    public void huecosLibres(){

    }


}
