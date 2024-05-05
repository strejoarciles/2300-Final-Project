import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends JPanel {
    private BufferedImage image1;
    private BufferedImage image2;

    public ImagePanel() {
        try {
            image1 = ImageIO.read(new File("PizzaMenu.jpg"));
            image2 = ImageIO.read(new File("IceCreamDrink.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		if (image1 != null && image2 != null) {
			double scaleFactor = 4.5; // Set the scale factor to 4.5
			int width = (int) (Math.max(image1.getWidth(), image2.getWidth()) / scaleFactor);
			int height = (int) ((image1.getHeight() + image2.getHeight()) / scaleFactor);
			setPreferredSize(new Dimension(width, height));

			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

			int x = (getWidth() - width) / 2;
			int y = (getHeight() - height) / 2;

			g2d.drawImage(image1, x, y, (int) (image1.getWidth() / scaleFactor), (int) (image1.getHeight() / scaleFactor), null);
			g2d.drawImage(image2, x, y + (int) (image1.getHeight() / scaleFactor), (int) (image2.getWidth() / scaleFactor), (int) (image2.getHeight() / scaleFactor), null);
		}

	}

}
