import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AnimalSheep extends Main {
    Icon iconSheep = new ImageIcon("Pictures/sheep.png");
    JButton sheep = new JButton(iconSheep);
    GeneralClass generalClass = new GeneralClass();
    public void realizationSheep() {
        sheep.setBorder(BorderFactory.createEmptyBorder());
        sheep.setContentAreaFilled(false);
        sheep.addActionListener(e -> {
            JFrame frame1 = new JFrame("Sheep");
            String path = "Pictures/zoo.png";
            ImageIcon icon = new ImageIcon(path);
            frame1.setIconImage(icon.getImage());
            frame1.setLayout(null);
            frame1.add(generalClass.label);
            generalClass.label.setBounds(230, 10, 100, 100);
            frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame1.setSize(500, 400);
            Icon iconSheep = new ImageIcon("Pictures/icon1.png");
            JButton button = new JButton(iconSheep);
            button.setBorder(BorderFactory.createEmptyBorder());
            button.setContentAreaFilled(false);
            JLabel jLabel = new JLabel();
            Image image = Toolkit.getDefaultToolkit().createImage("Pictures/minecraft-sheep.gif");
            ImageIcon imageIcon = new ImageIcon(image);
            imageIcon.setImageObserver(jLabel);
            jLabel.setBounds(265, 155, 190, 190);
            jLabel.setIcon(imageIcon);
            frame1.add(jLabel);
            JLabel jLabel1 = new JLabel();
            Image image1 = Toolkit.getDefaultToolkit().createImage("Pictures/minecraft-sheep.gif");
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
            System.out.println();
        });

    }
}