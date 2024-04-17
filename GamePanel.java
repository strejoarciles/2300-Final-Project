import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

public class GamePanel 
{
    JFrame frame;

    GamePanel()
    {
        frame = new JFrame("Resturant Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,650);
        frame.setBackground(Color.BLACK);
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        GamePanel game = new GamePanel();
		System.out.println("omair can also push");
        
    }

}


