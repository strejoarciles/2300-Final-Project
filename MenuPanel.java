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
        setLayout(new GridLayout(19, 1, 10, 10));

        JButton button1 = new JButton("Cheese");
        JButton button2 = new JButton("Halal Pepperoni");
        JButton button3 = new JButton("Peppers");
        JButton button4 = new JButton("Onions");
        JButton button5 = new JButton("Mushrooms");
        JButton button6 = new JButton("Pineapple");
        JButton button7 = new JButton("Halal Sausage");
        JButton button8 = new JButton("Spinach");
        JButton button9 = new JButton("Add Bubbles");
        JButton button10 = new JButton("Add Sprinkles");
        JButton button11 = new JButton("Strawberry");
        JButton button12 = new JButton("Chocolate");
        JButton button13 = new JButton("Vanilla");
        JButton button14 = new JButton("Water");
        JButton button15 = new JButton("Fanta");
        JButton button16 = new JButton("Coke");
        JButton button17 = new JButton("Sprite");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addCheeseTopping();
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPepperoniTopping();
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add peppers topping method here
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addOnionTopping();
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addMushroomTopping();
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPineappleTopping();
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSausageTopping();
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSpinachTopping();
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.addBubbleTopping();
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.addSprinkleTopping();
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(Color.PINK);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(new Color(102, 51, 0));
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(Color.YELLOW);
            }
        });
         button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.BLUE);
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.ORANGE);
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(new Color(102, 51, 0));
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.YELLOW);
            }
        });

        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(button11);
        add(button12);
        add(button13);
        add(button14);
        add(button15);
        add(button16);
        add(button17);
    }
}