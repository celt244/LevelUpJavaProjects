package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by java on 27.12.2016.
 */
public class OperationPanel extends JPanel{

    public OperationPanel(){
        GridBagLayout gridBagLayout = new GridBagLayout(3, 2, 5, 5);

        String[] opS = {"/", "*", "+", "-", "c"};
        for (String s : opS){
            JButton button = new JButton(s);
            gridBagLayout.addLayoutComponent(s, button);
            add(button);
        }
        setLayout(gridBagLayout);
    }
    public ActionListener getClickListener(){
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operation = e.getActionCommand();
            }
        }
    }
}
