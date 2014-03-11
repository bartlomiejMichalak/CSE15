import javax.swing.JApplet;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class FirstApplet extends JApplet 
                              
{
    private JTextField ioField; 

    public void init( )
    {
        JPanel textPanel = new JPanel( );
        ioField = new JTextField("Hello, World");
        ioField.setEditable(false);
        ioField.setEnabled(false);
        textPanel.add(ioField);
        add(textPanel, BorderLayout.WEST);
    }
}
