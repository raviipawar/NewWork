package inculcation.org.singleton;

public enum SingletonUsingEnum {

	INSTANCE;
	int i;
	public int getValue() {
		return i;
	}
	public void setValue(int i) {
		this.i=i;
	}
}
