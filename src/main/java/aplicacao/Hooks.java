package aplicacao;

import java.io.IOException;
import java.net.URL;

import apoio.Utils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	
	 public static AppiumDriver<MobileElement> driver;
	
	@Before
	public void iniciarDriver() throws IOException {
     Utils.log("Iniciando aplicativo...");
	 Capabilities capabilities = new Capabilities();
	 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities.getCapabilites());
	 Utils.log("Aplicativo Iniciado!");
	}
	
	@After
	public void FecharApp() throws InterruptedException {
		driver.quit();
	}


}
