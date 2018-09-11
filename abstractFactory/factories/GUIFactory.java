package designPatterns.abstractFactory.factories;

import designPatterns.abstractFactory.buttons.Button;
import designPatterns.abstractFactory.checkBoxes.CheckBox;

public interface GUIFactory {
	public abstract Button createButton();
	public abstract CheckBox createCheckBox();
}
