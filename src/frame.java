import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame {
    JButton btn=new JButton("CLICK ME TO OPEN NEW FRAME");
    public frame(){
        super("FAME TO OPEN NEW FRAME");

        setLayout(new FlowLayout());
        add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new newframe();
                dispose();
            }
        });


        setSize(400,400);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
