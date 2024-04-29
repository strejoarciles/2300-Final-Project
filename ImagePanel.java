import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel() {
        try {
            image = ImageIO.read(new File("Pizzaria.jpg")); // Load the image from file
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPreferredSize(new Dimension(300, 300)); // Set preferred size
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            int width = image.getWidth();
            int height = image.getHeight();
            int desiredWidth = 600; // Set the desired width
            int desiredHeight = (int) (height * ((double) desiredWidth / width)); // Calculate height to maintain aspect ratio
            g.drawImage(image, 400, 0, desiredWidth, desiredHeight, null); // Draw the image at the desired size
        }
    }
}
