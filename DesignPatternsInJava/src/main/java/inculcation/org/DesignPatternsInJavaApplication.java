package inculcation.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import inculcation.org.builder.Student;
import inculcation.org.builder.StudentBuilder;
import inculcation.org.factory.Android;
import inculcation.org.factory.FactoryClass;
import inculcation.org.factory.OS;
import inculcation.org.singleton.DemoSingleton;
import inculcation.org.singleton.DemoSingletonLazy;
import inculcation.org.singleton.DemoSingletonWithoutSyncBlock;
import inculcation.org.singleton.SingletonUsingEnum;

@SpringBootApplication
public class DesignPatternsInJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsInJavaApplication.class, args);
		DemoSingleton demoSingleton = DemoSingleton.getInstance();
		DemoSingleton demoSingleton2 = DemoSingleton.getInstance();
		
		DemoSingletonLazy demoSingletonLazy = DemoSingletonLazy.getInstance();
		DemoSingletonLazy demoSingletonLazy1 = DemoSingletonLazy.getInstance();
		
		DemoSingletonWithoutSyncBlock demoSingletonWithoutSyncBlock = DemoSingletonWithoutSyncBlock.getInstance();
		DemoSingletonWithoutSyncBlock demoSingletonWithoutSyncBlock1 = DemoSingletonWithoutSyncBlock.getInstance();
		
		SingletonUsingEnum singletonUsingEnum = SingletonUsingEnum.INSTANCE;
		System.out.println(singletonUsingEnum.getValue());
		singletonUsingEnum.setValue(2);
		System.out.println(singletonUsingEnum.getValue());
	
		
		
		
	   	/*
		 * checking value of instance created by getInstance() method
		 */
		System.out.println(demoSingleton.hashCode());
		System.out.println(demoSingleton2.hashCode());
		
		System.out.println(demoSingletonLazy.hashCode());
		System.out.println(demoSingletonLazy1.hashCode());
		
		System.out.println(demoSingletonWithoutSyncBlock.hashCode());
		System.out.println(demoSingletonWithoutSyncBlock1.hashCode());
		
		Student student = new StudentBuilder().setName("ravi").setAge(29).getStudent();
		System.out.println(student);
		
		Student student2 = new StudentBuilder().setName("rahul").setGender("male").setAge(25).getStudent();
		System.out.println(student2);
		
		/* printing without factory pattern by exposing data to client */
		
		/*
		 * OS obj = new Android(); obj.spec();
		 */

			/* printing with factory pattern by exposing data to client */
			
			FactoryClass fc = new FactoryClass();
			OS obj1 = fc.getInstance("efmlasdf");
			obj1.spec();
	}

}
