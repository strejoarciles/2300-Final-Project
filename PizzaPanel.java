import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class PizzaPanel extends JPanel {
    private List<Point> pepperoniToppings;
    private List<Point> pineappleToppings;
    private List<Point> veggieToppings;

    public PizzaPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);

        pepperoniToppings = new ArrayList<>();
        pineappleToppings = new ArrayList<>();
        veggieToppings = new ArrayList<>();
    }

    public void addPepperoniTopping() {
        addRandomToppings(pepperoniToppings, 10);
        repaint();
    }

    public void addPineappleTopping() {
        addRandomToppings(pineappleToppings, 10);
        repaint();
    }

    public void addVeggieTopping() {
        addRandomToppings(veggieToppings, 10);
        repaint();
    }

    private void addRandomToppings(List<Point> toppings, int count) {
        Random random = new Random();
        int pizzaRadius = 150;
        int toppingRadius = 10;

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(pizzaRadius * 2) - pizzaRadius;
            int y = random.nextInt(pizzaRadius * 2) - pizzaRadius;

            if (x * x + y * y <= pizzaRadius * pizzaRadius) {
                toppings.add(new Point(x + 200, y + 200));
            } else {
                i--;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255, 128, 128));
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.RED);
        for (Point topping : pepperoniToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        g.setColor(Color.YELLOW);
        for (Point topping : pineappleToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        g.setColor(Color.GREEN);
        for (Point topping : veggieToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }
    }
}
