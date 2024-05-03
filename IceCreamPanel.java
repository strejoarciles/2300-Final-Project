import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class IceCreamPanel extends JPanel {
    private List<Point> sprinkleToppings;
    private Color iceCreamColor;

    public IceCreamPanel() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.WHITE);
        sprinkleToppings = new ArrayList<>();
        iceCreamColor = new Color(102, 51, 0); // Default color is chocolate brown
    }

    public void addSprinkleTopping() {
        addRandomToppings(sprinkleToppings, 10);
        repaint();
    }

    public void setIceCreamColor(Color color) {
        this.iceCreamColor = color;
        repaint();
    }

    private void addRandomToppings(List<Point> toppings, int count) {
        Random random = new Random();
        int iceCreamWidth = 100;
        int iceCreamHeight = 75;
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
        g.setColor(Color.YELLOW);
        int[] xPoints = {150, 200, 250};
        int[] yPoints = {150, 250, 150};
        g.setColor(new Color(255, 204, 153));
        g.fillPolygon(xPoints, yPoints, 3);

        // Draw ice cream scoop
        g.setColor(iceCreamColor);
        int scoopX = 150;
        int scoopY = 100;
        int scoopWidth = 100;
        int scoopHeight = 75;
        g.fillOval(scoopX, scoopY, scoopWidth, scoopHeight);

        // Create a Graphics2D object
        Graphics2D g2d = (Graphics2D) g;

        // Create a Shape object representing the oval ice cream scoop
        Ellipse2D ovalShape = new Ellipse2D.Double(scoopX, scoopY, scoopWidth, scoopHeight);

        // Set the clipping shape to the oval ice cream scoop
        g2d.clip(ovalShape);

        // Draw sprinkles
        g.setColor(Color.RED);
        for (Point topping : sprinkleToppings) {
            g.fillOval(topping.x - 3, topping.y - 3, 6, 6);
        }

        // Reset the clipping shape to the default
        g2d.setClip(null);
    }
}