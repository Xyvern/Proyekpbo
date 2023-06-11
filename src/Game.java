import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    public Game(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Simple GUI Example");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                JButton button = new JButton("Close");
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        frame.dispose(); // Dispose the frame when the button is pressed
                    }
                });

                frame.getContentPane().add(button);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
