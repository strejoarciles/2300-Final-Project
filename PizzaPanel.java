// PizzaPanel.java
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class PizzaPanel extends JPanel {
    private List<Point> cheeseToppings;
    private List<Point> pepperoniToppings;
    private List<Point> onionToppings;
    private List<Point> mushroomToppings;
    private List<Point> pineappleToppings;
    private List<Point> sausageToppings;
    private List<Point> spinachToppings;
    private List<Point> pepperToppings;

    public PizzaPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
        cheeseToppings = new ArrayList<>();
        pepperoniToppings = new ArrayList<>();
        onionToppings = new ArrayList<>();
        mushroomToppings = new ArrayList<>();
        pineappleToppings = new ArrayList<>();
        sausageToppings = new ArrayList<>();
        spinachToppings = new ArrayList<>();
        pepperToppings = new ArrayList<>();
    }

    public void addPepperTopping()
    {
        addRandomToppings(pepperToppings, 10, Color.ORANGE);
        repaint();
    }

    public void addCheeseTopping() {
        addRandomToppings(cheeseToppings, 10, Color.WHITE);
        repaint();
    }

    public void addPepperoniTopping() {
        addRandomToppings(pepperoniToppings, 10, new Color(155,0,0));
        repaint();
    }

    public void addOnionTopping() {
        addRandomToppings(onionToppings, 10, new Color(128, 0, 128)); // Purple
        repaint();
    }

    public void addMushroomTopping() {
        addRandomToppings(mushroomToppings, 10, new Color(139, 69, 19)); // Brown
        repaint();
    }

    public void addPineappleTopping() {
        addRandomToppings(pineappleToppings, 10, Color.YELLOW);
        repaint();
    }

    public void addSausageTopping() {
        addRandomToppings(sausageToppings, 10, new Color(204, 102, 0));
        repaint();
    }

    public void addSpinachTopping() {
        addRandomToppings(spinachToppings, 10, new Color(0, 100, 0)); // Dark green
        repaint();
    }

private void addRandomToppings(List<Point> toppings, int count, Color toppingColor) {
    Random random = new Random();
    int pizzaRadius = 150;
    int sauceRadius = 140; // Adjust this value to match the red circle radius
    int toppingRadius = 10;
    for (int i = 0; i < count; i++) {
        int x = random.nextInt(sauceRadius * 2) - sauceRadius;
        int y = random.nextInt(sauceRadius * 2) - sauceRadius;
        if (x * x + y * y <= sauceRadius * sauceRadius) {
            toppings.add(new Point(x + 200, y + 200)); // Center coordinates
        } else {
            i--;
        }
    }
}

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw pizza crust
        g.setColor(new Color(255, 204, 153));
        g.fillOval(50, 50, 300, 300);

        // Draw pizza sauce
        g.setColor(Color.RED);
        g.fillOval(60, 60, 280, 280); // Increased sauce size

        // Draw cheese toppings
        g.setColor(Color.WHITE);
        for (Point topping : cheeseToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw pepperoni toppings
        g.setColor(new Color(155,0,0));
        for (Point topping : pepperoniToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw onion toppings
        g.setColor(new Color(128, 0, 128)); // Purple
        for (Point topping : onionToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw mushroom toppings
        g.setColor(new Color(139, 69, 19)); // Brown
        for (Point topping : mushroomToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw pineapple toppings
        g.setColor(Color.YELLOW);
        for (Point topping : pineappleToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw sausage toppings
        g.setColor(new Color(204, 102, 0));
        for (Point topping : sausageToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        //Draw pepper toppings
        g.setColor(Color.ORANGE);
        for (Point topping : pepperToppings)
        {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }

        // Draw spinach toppings
        g.setColor(new Color(0, 100, 0)); // Dark green
        for (Point topping : spinachToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }
    }
}