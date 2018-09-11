package designPatterns.abstractFactory.factories;

import designPatterns.abstractFactory.buttons.Button;
import designPatterns.abstractFactory.buttons.WindowOSButton;
import designPatterns.abstractFactory.checkBoxes.CheckBox;
import designPatterns.abstractFactory.checkBoxes.WindwsOSCheckBox;

public class WindowOSFactory implements GUIFactory{

	@Override
	public Button createButton() {
		return new WindowOSButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindwsOSCheckBox();
	}

}
