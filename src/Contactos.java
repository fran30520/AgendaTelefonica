public class Contactos {

    //variables y constantes
    private String nombre;
    private int numero;

    //constructor
    public Contactos(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //metodos Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //metodo toString
    public String toString(){
        return "El " + nombre + "tiene el número de telefono: " + numero;
    }
}
