//import javax.swing.SwingUtilities;
import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
	private PizzaPanel pizzaPanel;
	private MenuPanel menuPanel;
	private DrinkPanel drinkPanel;
	private IceCreamPanel iceCreamPanel;
	private JLabel titleLabel;


	public Game() {
		setTitle("FRITTS' PIZZERIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.YELLOW);  //Whatever color

		pizzaPanel = new PizzaPanel();
		drinkPanel = new DrinkPanel();
		iceCreamPanel = new IceCreamPanel();
		menuPanel = new MenuPanel(pizzaPanel, drinkPanel, iceCreamPanel);

		titleLabel = new JLabel();
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon titleIcon = new ImageIcon("pizzeria.jpg");
		Image titleImage = titleIcon.getImage().getScaledInstance(400, 100, Image.SCALE_SMOOTH);
		titleLabel.setIcon(new ImageIcon(titleImage));



		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new GridLayout(1, 2));
		bottomPanel.add(drinkPanel);
		bottomPanel.add(iceCreamPanel);

		JPanel leftPanel = new JPanel();
		leftPanel.setLayout(new BorderLayout());
		leftPanel.add(pizzaPanel, BorderLayout.CENTER);
		leftPanel.add(bottomPanel, BorderLayout.SOUTH);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, menuPanel);
		splitPane.setDividerLocation(850);
		splitPane.setPreferredSize(new Dimension(800, 1000));

		JPanel mainPanel = new JPanel(new BorderLayout());
		//mainPanel.add(imagePanel, BorderLayout.NORTH);
		mainPanel.add(splitPane, BorderLayout.CENTER);
		mainPanel.setPreferredSize(new Dimension(1200, 900)); // Set the desired starting size
															  
		ImagePanel imagePanel = new ImagePanel();

		JPanel contentPanel = new JPanel(new BorderLayout());
		contentPanel.add(titleLabel, BorderLayout.NORTH);
		contentPanel.add(imagePanel, BorderLayout.WEST);
		contentPanel.add(mainPanel, BorderLayout.CENTER);

															  

		add(contentPanel);

		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});
	}
}
