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
    private JLabel sizeLabel;
    private int toppingCount = 0;
    private int maxToppings = 0;
    private JButton button1; // Declare button1 as an instance variable
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8; 
    private JButton sizeSmall;
    private JButton sizeMedium;
    private JButton sizeLarge;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button15;
    JButton button16;
    JButton button17;

    public MenuPanel(PizzaPanel pizzaPanel, DrinkPanel drinkPanel, IceCreamPanel iceCreamPanel) {
        this.pizzaPanel = pizzaPanel;
        this.drinkPanel = drinkPanel;
        this.iceCreamPanel = iceCreamPanel;
        setPreferredSize(new Dimension(400, 800));
        setBackground(Color.LIGHT_GRAY);
        setLayout(new GridLayout(25,2));

        button1 = new JButton("Cheese");
        button2 = new JButton("Halal Pepperoni");
        button3 = new JButton("Peppers");
        button4 = new JButton("Onions");
        button5 = new JButton("Mushrooms");
        button6 = new JButton("Pineapple");
        button7 = new JButton("Halal Sausage");
        button8 = new JButton("Spinach");

        JButton button10 = new JButton("Add Sprinkles");
        button11 = new JButton("Strawberry");
        button12 = new JButton("Chocolate");
        button13 = new JButton("Vanilla");

        JButton button9 = new JButton("Add Extra Fizz");
        JButton button14 = new JButton("Water");
        button15 = new JButton("Fanta");
        button16 = new JButton("Coke");
        button17 = new JButton("Sprite");

        sizeSmall = new JButton("Small");
        sizeMedium = new JButton("Medium");
        sizeLarge = new JButton("Large");

        //Choose your size
        String sizeOption = new String("Choose your Pizza Size");
        sizeLabel = new JLabel(sizeOption);
        sizeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //total price
        String count = new String("Total Price: $");
        priceLabel = new JLabel(count);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //pizza options
        String pizzaOption = new String("Pizza Toppings");
        pizzaLabel= new JLabel(pizzaOption);
        pizzaLabel.setHorizontalAlignment(SwingConstants.CENTER);


        //drink options
        String drinkOption = new String("Drink Options");
        drinkLabel = new JLabel(drinkOption);
        drinkLabel.setHorizontalAlignment(SwingConstants.CENTER);



        //ice cream options
        String iceCreamOption = new String("Ice Cream Toppings");
        iceCreamLabel = new JLabel(iceCreamOption);
        iceCreamLabel.setHorizontalAlignment(SwingConstants.CENTER);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addCheeseTopping();
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPepperoniTopping();
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
                
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                pizzaPanel.addPepperTopping();
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });
    
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addOnionTopping();
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addMushroomTopping();
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addPineappleTopping();
                updateTotalPrice(1);
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSausageTopping();
                updateTotalPrice(1);
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.addSpinachTopping();
                updateTotalPrice(1);
                toppingCount++;
                if (toppingCount >= maxToppings) {
                    disableToppingButtons();
                }
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
                disableIceCream();

            }
        });

        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(new Color(102, 51, 0));
                updateTotalPrice(3);
                disableIceCream();


            }
        });

        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iceCreamPanel.setIceCreamColor(Color.YELLOW);
                updateTotalPrice(3);
                disableIceCream();

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
                disableDrinks();

            }
        });

        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(new Color(102, 51, 0));
                updateTotalPrice(2);
                disableDrinks();
            }
        });

        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drinkPanel.setDrinkColor(Color.YELLOW);
                updateTotalPrice(2);
                disableDrinks();
            }
        });

        sizeSmall.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.setSmallCrustSize();
                maxToppings  = 3;
                updateTotalPrice(5);
                disableSizeButtons();
            }
        });

        sizeMedium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.setMediumCrustSize();
                maxToppings = 4;
                updateTotalPrice(10);
                disableSizeButtons();
            }
        });

        sizeLarge.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaPanel.setLargeCrustSize();
                maxToppings = 5;
                updateTotalPrice(15);
                disableSizeButtons();

            }
        });

        add(sizeLabel);
        add(sizeSmall);
        add(sizeMedium);
        add(sizeLarge);

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

  private void disableToppingButtons() {
    if (toppingCount >= maxToppings)
    {
    button1.setEnabled(false);
    button2.setEnabled(false);
    button3.setEnabled(false);
    button4.setEnabled(false);
    button5.setEnabled(false);
    button6.setEnabled(false);
    button7.setEnabled(false);
    button8.setEnabled(false);
    }
}

private void disableSizeButtons() {
    sizeSmall.setEnabled(false);
    sizeMedium.setEnabled(false);
    sizeLarge.setEnabled(false);  
}

private void disableIceCream()
{
    button11.setEnabled(false);
    button12.setEnabled(false);
    button13.setEnabled(false);
}


private void disableDrinks()
{
    button15.setEnabled(false);
    button16.setEnabled(false);
    button17.setEnabled(false);
}
}