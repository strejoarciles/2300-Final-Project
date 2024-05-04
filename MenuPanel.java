import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuPanel extends JPanel {
    private int totalPrice = 0;
    private PizzaPanel pizzaPanel;
    private DrinkPanel drinkPanel;
    private IceCreamPanel iceCreamPanel;
    private JLabel priceLabel;
    private JLabel pizzaLabel;
    private JLabel iceCreamLabel;
    private JLabel drinkLabel;


    public MenuPanel(PizzaPanel pizzaPanel, DrinkPanel drinkPanel, IceCreamPanel iceCreamPanel) {
        this.pizzaPanel = pizzaPanel;
        this.drinkPanel = drinkPanel;
        this.iceCreamPanel = iceCreamPanel;
        setPreferredSize(new Dimension(400, 800));
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(21,2));

        JButton button1 = new JButton("Cheese");
        JButton button2 = new JButton("Halal Pepperoni");
        JButton button3 = new JButton("Peppers");
        JButton button4 = new JButton("Onions");
        JButton button5 = new JButton("Mushrooms");
        JButton button6 = new JButton("Pineapple");
        JButton button7 = new JButton("Halal Sausage");
        JButton button8 = new JButton("Spinach");
        JButton button9 = new JButton("Add Extra Fizz");
        JButton button10 = new JButton("Add Sprinkles");
        JButton button11 = new JButton("Strawberry");
        JButton button12 = new JButton("Chocolate");
        JButton button13 = new JButton("Vanilla");
        JButton button14 = new JButton("Water");
        JButton button15 = new JButton("Fanta");
        JButton button16 = new JButton("Coke");
        JButton button17 = new JButton("Sprite");

        //total price
        String count = new String("Total Price: $");
        priceLabel = new JLabel(count);

        //pizza options
        String pizzaOption = new String("Pizza Toppings");
        pizzaLabel= new JLabel(pizzaOption);

        //drink options
        String drinkOption = new String("Drink Options");
        drinkLabel = new JLabel(drinkOption);


        //ice cream options
        String iceCreamOption = new String("Ice Cream Toppings");
        iceCreamLabel = new JLabel(iceCreamOption);

        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pizzaPanel.addPepperTopping();
            }
        });


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
                updateTotalPrice(1);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSausageTopping();
                updateTotalPrice(1);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSpinachTopping();
                updateTotalPrice(1);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.addBubbleTopping();
                updateTotalPrice(1);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.addSprinkleTopping();
                updateTotalPrice(1);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(Color.PINK);
                updateTotalPrice(3);

            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(new Color(102, 51, 0));
                updateTotalPrice(3);

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(Color.YELLOW);
                updateTotalPrice(3);

            }
        });
         button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.BLUE);
                updateTotalPrice(0);

            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.ORANGE);
                updateTotalPrice(2);

            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(new Color(102, 51, 0));
                updateTotalPrice(2);

            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.YELLOW);
                updateTotalPrice(2);

            }
        });

        add(pizzaLabel);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);

       add(iceCreamLabel); 
        add(button10);
        add(button11);
        add(button12);
        add(button13);

        add(drinkLabel);
        add(button9);
        add(button14);
        add(button15);
        add(button16);
        add(button17);


        add(priceLabel);

    }

    public void updateTotalPrice(int updatePrice) 
  {
    totalPrice += updatePrice;
    priceLabel.setText("Total Price: $ " + totalPrice);
  }
}