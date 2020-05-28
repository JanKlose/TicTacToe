import java.awt.BorderLayout;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	
	
	public GameWindow (int width, int heigth) {
		
		setTitle("TicTacToe");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0,0,width,heigth);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(new BorderLayout());
		
		GamePanel gamePanel = new GamePanel();
		getContentPane().add(gamePanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
