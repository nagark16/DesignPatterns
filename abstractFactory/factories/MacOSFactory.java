package designPatterns.abstractFactory.factories;

import designPatterns.abstractFactory.buttons.Button;
import designPatterns.abstractFactory.buttons.MacOSButton;
import designPatterns.abstractFactory.checkBoxes.CheckBox;
import designPatterns.abstractFactory.checkBoxes.MacOSCheckBox;

public class MacOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new MacOSCheckBox();
	}
	
}
