package inculcation.org.singleton;

public class DemoSingletonWithoutSyncBlock {

	public static DemoSingletonWithoutSyncBlock demoSingletonWithoutSyncBlock;
	
	private DemoSingletonWithoutSyncBlock() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Using Double checking locking mechanism
	 */
	public static DemoSingletonWithoutSyncBlock getInstance() {
		if(demoSingletonWithoutSyncBlock==null) {
			synchronized (DemoSingletonWithoutSyncBlock.class) {
				if(demoSingletonWithoutSyncBlock==null) {
					demoSingletonWithoutSyncBlock= new DemoSingletonWithoutSyncBlock();
				}
				
			}
		}return demoSingletonWithoutSyncBlock;
	}
}
