import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JFrame implements ActionListener {

    public Panel() {
        super();
        iniciarFrame();
        iniciarComponentes();

    }

    public void iniciarFrame() {
        this.setTitle("Agenda Telefonica");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setBackground(Color.red);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public void iniciarComponentes() {
        miLabel = new JLabel("BIENVENIDOS A LA AGENDA TELEFONICA");
        miLabel.setFont(font);
        miLabel.setBounds(200, 50, 350, 30);
        nombre = new JLabel();
        nombre.setText("NOMBRE");
        nombre.setForeground(Color.RED);
        nombre.setBounds(100, 150, 100, 20);
        telefono = new JLabel();
        telefono.setText("TELEFONO");
        telefono.setForeground(Color.red);
        telefono.setBounds(100, 200, 100, 20);
        texto1 = new JFormattedTextField();
        texto1.setToolTipText("Escriba su nombre");
        texto1.setBounds(180, 150, 150, 20);
        texto2 = new JTextField();
        texto2.setToolTipText("Escriba su telefono");
        texto2.setBounds(180, 200, 150, 20);
        texto3 = new JTextField();
        texto3.setBounds(100, 300, 450, 150);
        botonAniadir = new JButton();
        botonAniadir.setText("Añadir");
        botonAniadir.setBounds(100, 250, 100, 30);
        botonAniadir.setToolTipText("Añadir contacto a la Agenda");
        botonAniadir.addActionListener(this);
        botonBuscar = new JButton();
        botonBuscar.setText("Buscar");
        botonBuscar.setBounds(205, 250, 100, 30);
        botonBuscar.setToolTipText("Buscar contacto de la Agenda");
        botonBuscar.addActionListener(this);
        botonEliminar = new JButton();
        botonEliminar.setText("Eliminar");
        botonEliminar.setBounds(310, 250, 100, 30);
        botonEliminar.setToolTipText("Eliminar contacto de la Agenda");
        botonBuscar.addActionListener(this);
        botonListar = new JButton();
        botonListar.setText("Listar");
        botonListar.setBounds(415, 250, 100, 30);
        botonListar.setToolTipText("Listar los contactos de la Agenda");
        botonListar.addActionListener(this);

        this.add(miLabel);
        this.add(nombre);
        this.add(telefono);
        this.add(texto1);
        this.add(texto2);
        this.add(texto3);
        this.add(botonAniadir);
        this.add(botonEliminar);
        this.add(botonBuscar);
        this.add(botonListar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAniadir) {
            String nombre = texto1.getText();
            int telefono = Integer.parseInt(texto2.getText());


            boolean hueco = false;

            if (existeContacto(c)) {
                System.out.println("El contacto ya existe");
            } else if (agendaLlena()) {
                System.out.println("La agenda esta llena");
            } else {
                for (int i = 0; i < contacto.length && !hueco; i++) {
                    if (contacto[i] == null) {
                        contacto[i] = c;
                        hueco = true;
                    }
                }
                if (hueco) {
                    System.out.println("El contacto se ha añadido");
                } else {
                    System.out.println("El contacto no se ha podido añadir");
                }
            }

            agenda.aniadirContacto(contacto);
            texto1.setText("");
            texto2.setText("");
            texto3.setText("El contacto se ha añadido correctamente");
        }
        if (e.getSource() == botonBuscar) {
            texto3.setText("");

            String nombre = JOptionPane.showInputDialog("Introduce el nombre a buscar");

            agenda.buscaContacto(nombre);
            //texto3.setText(agenda.buscaContacto(nombre));
        }
        if (e.getSource()==botonListar){
            texto3.setText("");

            for (int i = 0; i <contacto.length ; i++) {
                if (contacto[i]!=null){
                    texto3.setText((i+1) + "- El contacto de nombre: " + contacto[i].getNombre()
                            + " con telefono: " + contacto[i].getNumero());
                }

            }
            //agenda.listarContactos();
        }

    }

    public static void main(String[] args) {

        Panel panel=new Panel();
        panel.setVisible(true);
    }

    Font font = new Font("Fuente", Font.BOLD, 16);
    Agenda agenda = new Agenda(8);
    Contactos contacto[];
    private JButton botonAniadir;
    private JButton botonBuscar;
    private JButton botonEliminar;
    private JButton botonListar;
    private JLabel miLabel;
    private JLabel nombre;
    private JLabel telefono;
    private JTextField texto1;
    private JTextField texto2;
    private JTextField texto3;


}
