import javax.swing.*;

public class Panel extends JFrame {

    public Panel(){
        miFrame=new JFrame();
        miLabel=new JLabel("BIENVENIDOS A LA AGENDA TELEFONICA");
        miLabel.setBounds(20,20,300,30);
        miLabel.setVisible(true);
        miFrame.add(miLabel);

    }

    JFrame miFrame;
    JPanel miPanel;
    JLabel miLabel;

}
