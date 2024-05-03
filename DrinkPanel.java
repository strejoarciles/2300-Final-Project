import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class DrinkPanel extends JPanel {
    private List<Point> bubbleToppings;
    private Color drinkColor;

    public DrinkPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
        bubbleToppings = new ArrayList<>();
        drinkColor = new Color(204, 229, 255); // Default color is light blue
    }

    public void addBubbleTopping() {
        addRandomToppings(bubbleToppings, 10);
        repaint();
    }

    public void setDrinkColor(Color color) {
        this.drinkColor = color;
        repaint();
    }

    private void addRandomToppings(List<Point> toppings, int count) {
        Random random = new Random();
        int drinkWidth = 100;
        int drinkHeight = 200;
        int toppingRadius = 5;
        for (int i = 0; i < count; i++) {
            int x = random.nextInt(drinkWidth - toppingRadius * 2) + 250;
            int y = random.nextInt(drinkHeight - toppingRadius * 2) + 100;
            toppings.add(new Point(x, y));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw drink glass
        g.setColor(drinkColor);
        g.fillRect(250, 100, 100, 200);

        // Draw bubbles
        g.setColor(Color.WHITE);
        for (Point topping : bubbleToppings) {
            g.fillOval(topping.x - 5, topping.y - 5, 10, 10);
        }
    }
}