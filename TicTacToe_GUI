import java.util.ArrayList;

public class TicTacToe {

	private FieldValue currentPlayer;
	private ArrayList<Field> fields; 
	
	public static TicTacToe instance;
	
	public static void main(String[] args) {
			instance = new TicTacToe();
	
	}
	
	public TicTacToe() {
		
		new GameWindow(450, 455);
		
	}
	
	public void initGame() {
		
		currentPlayer = FieldValue.X;
		
		int fieldsMarginLeft = 16;
		int fieldsMarginTop = 5;
		int fieldsWidth = 411/3;
		int fieldsHeigth = 411/3;
		
		fields = new ArrayList<Field>();
		fields.add(new Field(fieldsMarginLeft, fieldsMarginTop, fieldsWidth, fieldsHeigth));
		fields.add(new Field(fieldsMarginLeft + 1*fieldsWidth, fieldsMarginTop, fieldsWidth, fieldsHeigth ));
		fields.add(new Field(fieldsMarginLeft + 2*fieldsWidth, fieldsMarginTop, fieldsWidth, fieldsHeigth));
		
		fields.add(new Field(fieldsMarginLeft, fieldsMarginTop + fieldsHeigth, fieldsWidth, fieldsHeigth));
		fields.add(new Field(fieldsMarginLeft + 1*fieldsWidth, + fieldsHeigth, fieldsWidth, fieldsHeigth ));
		fields.add(new Field(fieldsMarginLeft + 2*fieldsWidth, + fieldsHeigth, fieldsWidth, fieldsHeigth));
		
		fields.add(new Field(fieldsMarginLeft, fieldsMarginTop, + 2*fieldsHeigth, fieldsHeigth));
		fields.add(new Field(fieldsMarginLeft + 1*fieldsWidth, + 2*fieldsHeigth, fieldsWidth, fieldsHeigth ));
		fields.add(new Field(fieldsMarginLeft + 2*fieldsWidth, + 2*fieldsHeigth, fieldsWidth, fieldsHeigth));
		
	}
	
	public void nextPlayerTurn() {
		if(currentPlayer == FieldValue.X) {
			currentPlayer = FieldValue.O;
		} else {
			currentPlayer = FieldValue.X;
		}
	}
	
	public FieldValue getCurrentPlayer() {
		return currentPlayer;
	}
	
	public ArrayList<Field> getFields() {
		return fields;
	}
	
	public boolean isWon() {
		int [][] matrix = new int[3][3];
		matrix[0][0] = fields.get(0).getValue().getValue();
		matrix[0][1] = fields.get(0).getValue().getValue();
		matrix[0][2] = fields.get(0).getValue().getValue();
		matrix[1][0] = fields.get(0).getValue().getValue();
		matrix[1][1] = fields.get(0).getValue().getValue();
		matrix[1][2] = fields.get(0).getValue().getValue();
		matrix[2][0] = fields.get(0).getValue().getValue();
		matrix[2][1] = fields.get(0).getValue().getValue();
		matrix[2][2] = fields.get(0).getValue().getValue();
		
		return Math.abs(matrix[0][0] + matrix[0][1] + matrix[0][2]) == 3 ||
				Math.abs(matrix[1][0] + matrix[1][1] + matrix[1][2]) == 3 ||
				Math.abs(matrix[2][0] + matrix[2][1] + matrix[2][2]) == 3 ||
				
				Math.abs(matrix[0][0] + matrix[1][0] + matrix[2][0]) == 3 ||
				Math.abs(matrix[0][1] + matrix[1][1] + matrix[2][1]) == 3 ||
				Math.abs(matrix[0][2] + matrix[1][2] + matrix[2][2]) == 3 ||
				
				Math.abs(matrix[0][0] + matrix[1][1] + matrix[2][2]) == 3 ||
				Math.abs(matrix[0][2] + matrix[1][1] + matrix[2][2]) == 3;
				
	}
	
	public boolean isDraw() {
		for(Field field: this.getFields()) {
			if(field.getValue() == FieldValue.EMPTY)
				return false;
		}
		return !isWon();
	}

}
