import javax.swing.*;
import java.awt.*;

public class AnimalTiger extends Main {
    Icon iconTiger = new ImageIcon("Pictures/tiger.png");
    JButton tiger = new JButton(iconTiger);
    GeneralClass generalClass = new GeneralClass();
    public void realizationTiger(){
        tiger.setBorder(BorderFactory.createEmptyBorder());
        tiger.setContentAreaFilled(false);
        tiger.addActionListener(e -> {
            JFrame frame1 = new JFrame("Tiger");
            String path = "Pictures/zoo.png";
            ImageIcon icon = new ImageIcon(path);
            frame1.setIconImage(icon.getImage());
            frame1.setLayout(null);
            frame1.add(generalClass.label);
            generalClass.label.setBounds(230, 10, 100, 50);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setSize(500, 400);
            Icon iconTiger = new ImageIcon("Pictures/icon1.png");
            JButton button = new JButton(iconTiger);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setContentAreaFilled(false);
            JLabel jLabel = new JLabel();
            Image image = Toolkit.getDefaultToolkit().createImage("Pictures/tigr.gif");
            ImageIcon imageIcon = new ImageIcon(image);
            imageIcon.setImageObserver(jLabel);
            jLabel.setBounds(265, 155, 190, 190);
            jLabel.setIcon(imageIcon);
            frame1.add(jLabel);
            JLabel jLabel1 = new JLabel();
            Image image1 = Toolkit.getDefaultToolkit().createImage("Pictures/tigr1.gif");
            ImageIcon imageIcon1 = new ImageIcon(image1);
            imageIcon1.setImageObserver(jLabel1);
            jLabel1.setBounds(5, 10, 190, 190);
            jLabel1.setIcon(imageIcon1);
            frame1.add(jLabel1);
            frame1.getContentPane().setBackground(Color.PINK);
            button.setBounds(180, 90, 100, 100);
            button.addActionListener(generalClass.actionListener);
            frame1.add(button);
            frame1.setVisible(true);
        });
    }
}
