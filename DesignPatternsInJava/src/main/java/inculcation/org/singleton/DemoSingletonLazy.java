package inculcation.org.singleton;

public class DemoSingletonLazy {

	public static DemoSingletonLazy demoSingletonLazy;
	
	private DemoSingletonLazy() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * LAZY INSTANTIATION with thread safety
	 * 
	 * Singleton thread safe instance creation lazy instantiation synchronized
	 * because if two thread same time try to create, but performance goes down
	 */
	public static synchronized DemoSingletonLazy getInstance() {
		if (demoSingletonLazy == null) {
			demoSingletonLazy = new DemoSingletonLazy();
		}
		return demoSingletonLazy;
	}
	
}
