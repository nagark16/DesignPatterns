package designPatterns.abstractFactory;

import designPatterns.abstractFactory.app.Client;
import designPatterns.abstractFactory.factories.GUIFactory;
import designPatterns.abstractFactory.factories.MacOSFactory;
import designPatterns.abstractFactory.factories.WindowOSFactory;

public class Demo {

	public static void main(String[] args) {
		Client client = configureClient();
		client.paint();
	}

	private static Client configureClient() {
		Client client;
		GUIFactory factory;
		String osname = System.getProperty("os.name").toLowerCase();
		if(osname.contains("mac")) {
			factory = new MacOSFactory();
			client = new Client(factory);
		}else {
			factory = new WindowOSFactory();
			client = new Client(factory);
		}
			
		return client;
	}
}
