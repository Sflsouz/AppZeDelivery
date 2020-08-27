package aplicacao;

import java.io.IOException;
import java.net.URL;

import apoio.Print;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public static AppiumDriver<MobileElement> driver;

	@Before
	public void iniciarDriver() throws IOException {
		Setup setup = new Setup();
		if (setup.getPlataforma().equals("ANDROID")) {
			Capabilities capabilities = new Capabilities();
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities.getCapabilites());
		}
	}

	@After
	public void FecharApp(Scenario scenario) throws InterruptedException {
		if (Setup.getPlataforma().equals("ANDROID")) {
			Print.printarTela(scenario);
			if (driver != null) {
				driver.quit();
			}
		}
	}

}
