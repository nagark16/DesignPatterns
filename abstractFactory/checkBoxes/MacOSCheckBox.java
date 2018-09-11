package designPatterns.abstractFactory.checkBoxes;

public class MacOSCheckBox implements CheckBox{

	@Override
	public void paint() {
		System.out.println("Mac OS checkbox created");
	}

}
