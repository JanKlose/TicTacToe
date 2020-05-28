import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements MouseListener{

	public GamePanel() {
		setBackground(Color.WHITE);
		requestFocus();
		addMouseListener(this);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		for(Field field : TicTacToe.instance.getFields()) {
			field.draw(g2d);
		} 
	}
	
	private void checkField(int x, int y) {
		Rectangle cursorHitbox = new Rectangle(x,y,1,1);
		for(Field field : TicTacToe.instance.getFields()) {
			if(cursorHitbox.intersects(field) ) {
				if(field.getValue() == FieldValue.EMPTY) {
					field.setValue(TicTacToe.instance.getCurrentPlayer());
					repaint();
					TicTacToe.instance.nextPlayerTurn();
				}
				break;
			}
		}
	}
	
	private void checkWin() {
		if(TicTacToe.instance.isWon() ) {
			JOptionPane.showMessageDialog(this, "Spieler" + TicTacToe.instance.getCurrentPlayer().name() + "hat gewonnen", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
			TicTacToe.instance.initGame();
			repaint();
		} else if (TicTacToe.instance.isDraw())
		{
			JOptionPane.showMessageDialog(this, "Niemand hat gewonnen!", "GAME OVER!", JOptionPane.INFORMATION_MESSAGE);
			TicTacToe.instance.initGame();
			repaint();
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		checkField(e.getX(), e.getY());
		checkWin();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
