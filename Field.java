import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Field extends Rectangle{
	
	private FieldValue value;
	
	public Field(int x, int y, int width, int heigth) {
		super(x, y, width, heigth);	
		value = FieldValue.EMPTY;	
		
	}

	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.drawRect(x, y, width, height);
		
		if(value == FieldValue.O) {
			g2d.drawOval(x + 5, y + 5, width - 10, height - 10);
		} else if(value == FieldValue.X) {
				g2d.drawLine(x +5, y +5, x + width - 5, y + height - 5);
				g2d.drawLine(x + width - 5, y + 5, x + 5, y + height - 5);
			}
		}

	
	public FieldValue getValue() {
		return value;
	}
	public void setValue(FieldValue value) {
		this.value = value;
	}
	
	
}
