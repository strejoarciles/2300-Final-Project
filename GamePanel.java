import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {
    private PizzaPanel pizzaPanel;
    private MenuPanel menuPanel;

    public GamePanel() {
        pizzaPanel = new PizzaPanel();
        menuPanel = new MenuPanel(pizzaPanel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pizzaPanel, menuPanel);
        splitPane.setDividerLocation(450);

        add(splitPane);
    }
}
