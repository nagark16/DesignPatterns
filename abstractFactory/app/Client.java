package designPatterns.abstractFactory.app;

import designPatterns.abstractFactory.buttons.Button;
import designPatterns.abstractFactory.checkBoxes.CheckBox;
import designPatterns.abstractFactory.factories.GUIFactory;

public class Client {

	private Button button;
	private CheckBox checkBox;
	
	public Client(GUIFactory factory) {
		button = factory.createButton();
		checkBox = factory.createCheckBox();
	}
	
	public void paint() {
		button.paint();
		checkBox.paint();
	}
}
