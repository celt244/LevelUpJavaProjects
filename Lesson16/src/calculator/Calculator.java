package calculator;

import MainPanel.MainPanel;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    public static JTextField textField = new JTextField();

    public static void main(String[] args) {
        JFrame frame = new JFrame ("This is my title");
        frame.setSize(250, 350);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout borderLayout = new BorderLayout();

        borderLayout.addLayoutComponent(textField, BorderLayout.NORTH);
        frame.add(textField);

        MainPanel mainPanel = new MainPanel();
        borderLayout.addLayoutComponent(mainPanel, BorderLayout.CENTER);
        frame.add(mainPanel);

        NumberPanel numberPanel = new NumberPanel();

        gridBagLayout.addLayoutComponent("NumberPanel", numberPanel);
        add(numberPanel);

        OperationPanel operationPanel = new OperationPanel();
        gridBagLayout.addLayoutComponent("OperationPanel", operationPanel);
        add(operationPanel);

        frame.setLayout(borderLayout);
        frame.setVisible(true);
    }
}
