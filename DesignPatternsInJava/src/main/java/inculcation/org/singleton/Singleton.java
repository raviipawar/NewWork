package inculcation.org.singleton;

public class Singleton {

	public static void main(String args[]) {
		DemoSingleton demoSingleton = DemoSingleton.getInstance();
		DemoSingleton demoSingleton2 = DemoSingleton.getInstance();
		
		DemoSingletonLazy demoSingletonLazy = DemoSingletonLazy.getInstance();
		DemoSingletonLazy demoSingletonLazy1 = DemoSingletonLazy.getInstance();
		
		DemoSingletonWithoutSyncBlock demoSingletonWithoutSyncBlock = DemoSingletonWithoutSyncBlock.getInstance();
		DemoSingletonWithoutSyncBlock demoSingletonWithoutSyncBlock1 = DemoSingletonWithoutSyncBlock.getInstance();
		
		SingletonUsingEnum singletonUsingEnum = SingletonUsingEnum.INSTANCE;
		singletonUsingEnum.i= 10;
		singletonUsingEnum.show();
		
		
	   	/*
		 * checking value of instance created by getInstance() method
		 */
		System.out.println(demoSingleton.hashCode());
		System.out.println(demoSingleton2.hashCode());
		
		System.out.println(demoSingletonLazy.hashCode());
		System.out.println(demoSingletonLazy1.hashCode());
		
		System.out.println(demoSingletonWithoutSyncBlock.hashCode());
		System.out.println(demoSingletonWithoutSyncBlock1.hashCode());
		
		System.out.println(singletonUsingEnum);


	}
}
