import javax.swing.*;
import java.awt.*;

public class newframe extends JFrame {
    JLabel label=new JLabel("WELCOME THIS IS NEW FRAME");

    public newframe(){
        super("THIS IS NEW FRAME");
        setLayout(new FlowLayout());
        add(label);

        setSize(600,600);
        setVisible(true);
        setResizable(false);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
