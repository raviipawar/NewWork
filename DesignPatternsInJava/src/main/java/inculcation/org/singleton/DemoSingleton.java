package inculcation.org.singleton;

public class DemoSingleton {

	public static DemoSingleton demoSingleton = new DemoSingleton();

	private DemoSingleton() {

	}

	/*
	 * EARLY INSTANTIATION
	 */
	public static DemoSingleton getInstance() {
		return demoSingleton;
	}

}
