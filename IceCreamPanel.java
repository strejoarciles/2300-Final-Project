import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class IceCreamPanel extends JPanel {
    private List<Point> sprinkleToppings;

    public IceCreamPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
        sprinkleToppings = new ArrayList<>();
    }

    public void addSprinkleTopping() {
        addRandomToppings(sprinkleToppings, 10);
        repaint();
    }

    private void addRandomToppings(List<Point> toppings, int count) {
        Random random = new Random();
        int iceCreamWidth = 100;
        int iceCreamHeight = 150;
        int toppingRadius = 3;

        for (int i = 0; i < count; i++) {
            int x = random.nextInt(iceCreamWidth - toppingRadius * 2) + 150;
            int y = random.nextInt(iceCreamHeight - toppingRadius * 2) + 100;
            toppings.add(new Point(x, y));
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw ice cream cone
        g.setColor(Color.RED);
        int[] xPoints = {150, 200, 250};
        int[] yPoints = {150, 250, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw ice cream scoop
        g.setColor(Color.PINK);
        g.fillOval(150, 100, 100, 75);

        // Draw sprinkles
        g.setColor(Color.RED);
        for (Point topping : sprinkleToppings) {
            g.fillOval(topping.x - 3, topping.y - 3, 6, 6);
        }
    }
}