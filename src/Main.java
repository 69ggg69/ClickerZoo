/*Создайте игру "Симулятор зоопарка",
где фабричный метод используется для создания разных видов животных.

 */
import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zoo");
        String path = "Pictures/zoo.png";
        ImageIcon icon = new ImageIcon(path);
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 450);
        AnimalSheep animalSheep = new AnimalSheep();
        animalSheep.realizationSheep();
        AnimalTiger animalTiger = new AnimalTiger();
        animalTiger.realizationTiger();
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        GridLayout gridLayout = new GridLayout(1, 3);
        panel.setLayout(gridLayout);
        panel.add(animalSheep.sheep);
        frame.add(panel);
        panel.add(animalTiger.tiger);
        frame.setVisible(true);
    }

}