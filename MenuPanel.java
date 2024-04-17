import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
    private PizzaPanel pizzaPanel;

    public MenuPanel(PizzaPanel pizzaPanel) {
        this.pizzaPanel = pizzaPanel;

        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(4, 1, 10, 10));

        JButton button1 = new JButton("Pepperoni");
        JButton button2 = new JButton("Pineapple");
        JButton button3 = new JButton("Veggies");
        JButton button4 = new JButton("Bake Pizza");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPepperoniTopping();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPineappleTopping();
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addVeggieTopping();
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bake Pizza clicked!");
            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
}
