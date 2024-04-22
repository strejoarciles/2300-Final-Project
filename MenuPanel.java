import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
    private PizzaPanel pizzaPanel;
    private DrinkPanel drinkPanel;
    private IceCreamPanel iceCreamPanel;

    public MenuPanel(PizzaPanel pizzaPanel, DrinkPanel drinkPanel, IceCreamPanel iceCreamPanel) {
        this.pizzaPanel = pizzaPanel;
        this.drinkPanel = drinkPanel;
        this.iceCreamPanel = iceCreamPanel;

        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(6, 1, 10, 10));

        JButton button1 = new JButton("Pepperoni");
        JButton button2 = new JButton("Pineapple");
        JButton button3 = new JButton("Veggies");
        JButton button4 = new JButton("Bake Pizza");
        JButton button5 = new JButton("Add Bubbles");
        JButton button6 = new JButton("Add Sprinkles");

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

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.addBubbleTopping();
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.addSprinkleTopping();
            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
    }
}