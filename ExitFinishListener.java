
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExitFinishListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {


        System.exit(0);
    }
}