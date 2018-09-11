package designPatterns.abstractFactory.buttons;

public class WindowOSButton implements Button{

	@Override
	public void paint() {
		System.out.println("Windows OS button created");
	}

}
