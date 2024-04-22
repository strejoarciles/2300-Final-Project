import javax.swing.*;

public class GamePanel extends JPanel {
    private PizzaPanel pizzaPanel;
    private MenuPanel menuPanel;
    private DrinkPanel drinkPanel;
    private IceCreamPanel iceCreamPanel;

    public GamePanel() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));

        pizzaPanel = new PizzaPanel();
        drinkPanel = new DrinkPanel();
        iceCreamPanel = new IceCreamPanel();
        menuPanel = new MenuPanel(pizzaPanel, drinkPanel, iceCreamPanel);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pizzaPanel, menuPanel);
        splitPane.setDividerLocation(450);

        add(drinkPanel);
        add(iceCreamPanel);
        add(splitPane);
    }
}
