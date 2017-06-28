import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.*;

public class LabelPanel extends JPanel {

    public LabelPanel(){
        JLabel plainLabel = new JLabel("Plain small label");
        add(plainLabel);

        JLabel fancyLabel = new JLabel("Fancy Big Label");

        Font fancyFont = new Font("Serif",
                Font.BOLD | Font.ITALIC, 32);

        fancyLabel.setFont(fancyFont);

        Icon folderIcon = new ImageIcon("we.jpg");
        fancyLabel.setIcon(folderIcon);

        Icon tigerIcon = new MetalIconFactory.FolderIcon16();

//      fancyLabel.setIcon(tigerIcon);
        fancyLabel.setIcon(folderIcon);

        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
        add(fancyLabel);
    }
}
