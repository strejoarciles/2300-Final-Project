import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Fritt's Pizzeria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 900);
        setBackground(java.awt.Color.BLACK);

        GamePanel gamePanel = new GamePanel();
        ImagePanel imagePanel = new ImagePanel(); // Add ImagePanel
        add(gamePanel, BorderLayout.CENTER); // Add GamePanel to the center
        add(imagePanel, BorderLayout.PAGE_START); // Add ImagePanel to the top

        pack(); // Automatically resize the frame to fit its components
        setVisible(true);
    }
}