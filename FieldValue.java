
public enum FieldValue {
	X(1), O(-1), EMPTY(0);
	
	int value;
	private FieldValue(int val)  {
		value = val;
	}
	
	int getValue() {
		return value;
	}
	
	
}
