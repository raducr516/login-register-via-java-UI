package loginregister;
import javax.swing.*;

public class LoginRegister {

    public static JFrame frame = new JFrame();

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()->{
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setContentPane(new login());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
    
}
