package inculcation.org.factory;

public class FactoryClass {

	public OS getInstance(String str) {
		if (str.equals("OPEN")) {
			return new Android();
		} else if (str.equals("CLOSE")) {
			return new IOS();
		}
		return new Windows();
	}
}
