import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Restaurant Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 650);
        setBackground(java.awt.Color.BLACK);

        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        setVisible(true);
    }
}