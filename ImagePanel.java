import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage[] images; // Array to hold the images

    public ImagePanel() {
        images = new BufferedImage[5]; // Initialize the array to hold five images
        try {
            images[0] = ImageIO.read(new File("EmptySpace.jpg")); // Load the first image
            images[1] = ImageIO.read(new File("EmptySpace.jpg")); // Load the second image
            images[2] = ImageIO.read(new File("PizzeriaTitle.jpg")); // Load the third image
            images[3] = ImageIO.read(new File("EmptySpace.jpg")); // Load the fourth image
            images[4] = ImageIO.read(new File("EmptySpace.jpg")); // Load the fifth image
        } catch (IOException e) {
            e.printStackTrace();
        }
        setPreferredSize(new Dimension(600, 300)); // Set preferred size to accommodate three images
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 0; // Initial x-coordinate for the first image
        for (int i = 0; i < images.length; i++) {
            BufferedImage image = images[i];
            if (image != null) {
                int width = image.getWidth();
                int height = image.getHeight();
                int desiredWidth;
                int desiredHeight;

                if (i == 2) { // If it's the third image (index 2)
                    desiredWidth = 310; // Set the desired width to 250 (slightly smaller)
                    desiredHeight = (int) (height * ((double) desiredWidth / width)); // Calculate height to maintain aspect ratio
                } else {
                    desiredWidth = 300; // Set the desired width for other images
                    desiredHeight = (int) (height * ((double) desiredWidth / width)); // Calculate height to maintain aspect ratio
                }

                g.drawImage(image, x, 0, desiredWidth, desiredHeight, null); // Draw the image at the desired size
                x += desiredWidth; // Increment x-coordinate for the next image
            }
        }
    }
}