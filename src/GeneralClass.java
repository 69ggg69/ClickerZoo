
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GeneralClass {
    JLabel label = new JLabel("0");
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setForeground(Color.RED);
            String number = label.getText();
            int value = Integer.parseInt(number);
            value++;
            number = String.valueOf(value);
            label.setText(number);
        }
    };

    }


